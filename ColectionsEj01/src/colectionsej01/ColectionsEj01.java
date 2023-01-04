/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colectionsej01;

import Entida.Can;
import Servicios.CanService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author lukaku20
 */
public class ColectionsEj01 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CanService under = new CanService();
        ArrayList<Can> dogs = new ArrayList();
        String imprime = "";
        String anwser="";    
        while (true){
            System.out.println("¿Do you want to create a Dog?");
            String s = (leer.next()); 
            if (s.equalsIgnoreCase("yes")){
                dogs.add(under.crearDog());
                under.asignarNumber(dogs);
                } else{
                    leer.nextLine();
                    System.out.println("You want to exit?");
                    anwser = leer.nextLine();   
                } 
            if (anwser.equals("yes")) {
                System.out.println("THE END`s.");
                break;
            } else {
                System.out.println("¿You want to see printed the dogs on the screen?");
                leer.nextLine();
                imprime = leer.nextLine();

            }
            if (imprime.equalsIgnoreCase("yes")) {
                dogs.forEach((dog) -> {
                    System.out.println(dog.toString());
                });
            }
            
            
            System.out.println("¿You want to delete from the list?");
            String remover; 
            String nombre="";
            Iterator iterator = dogs.iterator();
            remover = leer.nextLine();
            if(remover.equals("yes")){
                
                
                System.out.println("¿What`s dog?");
               
                under.eliminarDog(dogs);
                              
                
                }
            }
        
    
}
}

