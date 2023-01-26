package bookstore;

import Entida.Book;
import Servicios.BookService;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * @author lukaku20
 */
public class BookStore {

    
    public static void main(String[] args) {
        BookService ayudaLibro = new BookService();
        ArrayList<Book> books = new ArrayList();
        Scanner leer = new Scanner(System.in);
        boolean exit = false;
        while(true){
            System.out.println("Ready to put some books?");
            String anwser = leer.next();
            if(anwser.equals("yes")){
                Book book = ayudaLibro.crearBook();
                books.add(book);
            } else{
                System.out.println("You want to exit?");
                anwser = leer.next();
                if(anwser.equals("yes")){
                   exit = true;
                   System.out.println("Close this program.");
                }
            }
            if(exit){
                break;
                
            }
                    
            System.out.println("Do you want printed all the books on the screen?");
            anwser = leer.next();
            if (anwser.equals("yes")){
                for (Book book : books){
                    System.out.println(book.toString());
                }
            }
            
            
        }
       
    
}
}
