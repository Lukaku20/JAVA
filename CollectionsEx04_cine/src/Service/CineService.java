/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entida.Film;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author lukaku20
 */
public class CineService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public Film makeFilm(){
        Film m = new Film();
        System.out.println("Which name of movie?");
        String read = leer.nextLine();
        m.setTitule(read);
        System.out.println("What`s the Director?");
        m.setDirector(leer.nextLine());
        System.out.println("How many minutes does the movie last?");
        int readMe = leer.nextInt();
        m.setMinutes(readMe);
        m.setHours(passMinutes(m.getMinutes()));
        System.out.println("Complete, you can continue...");
        leer.nextLine();
        return m;
    }
    
    public String passMinutes(int readMe){
        String formato = "%02d:%02d";
        long horasReales = TimeUnit.MINUTES.toHours(readMe);
        long minutosReales = TimeUnit.MINUTES.toMinutes(readMe)- TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours(readMe));
        return String.format(formato, horasReales, minutosReales);
    }
    public ArrayList<Film> ordenarFilms(ArrayList<Film> listOfFilm){
        System.out.println("How do you wan to order it?");
        System.out.println("1. for duration.");
        System.out.println("2. in alphabetical order of titule.");
        System.out.println("3. in alphabetical order of director.");
        switch (leer.nextInt()) {
            case 1:
                ordenaMinutes(listOfFilm);
                break;
            case 2:
                ordenaTitule(listOfFilm);
                break;
            case 3:
                ordenaDirector(listOfFilm);
                break;
            default:
                System.out.println("This an incorrect choice.");


        }
        leer.nextLine();
        listOfFilm.forEach((films) -> {
            System.out.println(films.toString());
        });
        return listOfFilm;
    }
    
    public void chargeList(ArrayList<Film> listOfFilm){
        listOfFilm.add(new Film("Titanic","James Cameron", "03:10", 190));
        listOfFilm.add(new Film("Top Gun", "Tony Scott", "02:30", 150));
        listOfFilm.add(new Film("Terminator", "James Cameron", "01:48", 108));
        listOfFilm.add(new Film("Die hard", "John McTiernan", "02:12", 132));
        listOfFilm.add(new Film("Liar liar", "Tom Shadyac", "01:27", 87));
        listOfFilm.add(new Film("Gladiator", "Ridley Scott", "02:35", 155));
        
        
    }
    
    public void ordenaMinutes(ArrayList<Film> listOfFilm){
        listOfFilm.sort(Comparator.comparing(Film::getMinutes));
    }
    
    public void ordenaTitule(ArrayList<Film> listOfFilm){
        listOfFilm.sort(Comparator.comparing(Film::getTitule));
    }
    public void ordenaDirector(ArrayList<Film> listOfFilm){
        listOfFilm.sort(Comparator.comparing(Film::getDirector));
    }
    
}

