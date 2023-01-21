
package collectionsex04_cine;

import Entida.Film;
import Service.CineService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



/**
 * @author lukaku20
 */
public class CollectionsEx04_cine {

    
    public static void main(String[] args) {
        ArrayList<Film> listOfFilm = new ArrayList();
        Iterator it = listOfFilm.iterator();
        CineService callCine = new CineService();
        callCine.chargeList(listOfFilm);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean exit = false;
        String read = "";
        int readMe;
        while(!exit){
            callCine.printScreen();
            readMe = leer.nextInt();
            leer.nextLine();
            switch(readMe){
                case 1:
                    Film newFilm = callCine.makeFilm();
                    listOfFilm.add(newFilm);
                    break;
                case 2:
                    for (Film films : listOfFilm) {
                        System.out.println(films.toString());
                    }
                    break;
                case 3:
                    callCine.ordenarFilms(listOfFilm);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("This an incorrect choice.");
            }
            
            /*/ ConcurrentModificationExceptionWithArrayList
            while(it.hasNext()){
                it.next().toString();
            
            */ 
        }
        
        
        
    }
    
}
