/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entida.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class BookService {
    Scanner leer = new Scanner (System.in);
    public Book crearBook(){
        Book a = new Book();
        System.out.println("Enter book`s identification : ");
        a.setId(leer.nextInt());
        System.out.println("Name of the book: ");
        leer.nextLine();
        a.setName(leer.nextLine());
        System.out.println("¿Who wrote the book? ");
        a.setAuthor(leer.nextLine());
        System.out.println("Which year?");
        a.setYear(leer.nextInt());
        System.out.println("What are your keywords?");
        leer.nextLine();
        a.setWordsX(leer.nextLine());
        System.out.println("The data is complete...");
        return a;
    }
    
    public void imprimirCollection(ArrayList<Book> books){
        for ( Book b : books){
            System.out.println(books.toString());
        }
        
        
    }
}
