
package Servicios;

import Entida.Can;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */

public class CanService {
   public Scanner leer = new Scanner(System.in);
   ArrayList<Can> dogs = new ArrayList();
    public void crearDog(){
        Can poo = new Can();
        System.out.println("¿What it his name?");
        poo.setName(leer.next());
        System.out.println("¿How years old?");
        poo.setAge(leer.nextInt());
        System.out.println("¿What breed is the dog?");
        leer.nextLine();
        poo.setRaza(leer.nextLine());
        System.out.println("¿What`s color is?");
        poo.setColor(leer.nextLine());
        System.out.println("¿What`s sex?");
        poo.setSex(leer.next().substring(0));
        System.out.println("¿How much does the dog weigth?");
        poo.setSize(leer.nextDouble());
        dogs.add(poo);
        asignarNumber(dogs);

    }
    
    public void asignarNumber(ArrayList<Can> dogs){
        
        for (Can dog : dogs){
            
            dog.setNumer(dogs.indexOf(dog));
            
        }
    }
    public void optionEliminar(){
                
                System.out.println("¿What`s dog?");
               
                eliminarDog(dogs);
    }
   public void eliminarDog(ArrayList<Can> dogs){
       
       for (Can dog: dogs){
           System.out.println("Perro: "+ dog.getNumer());
       }
       int position = leer.nextInt();
       dogs.remove(position);
   }
   public void imprimeScreen(ArrayList<Can> dogs){
       dogs.forEach((dog) -> {
                    System.out.println(dog.toString());
                });
       System.out.println(" ");
       System.out.println(" ");
   }
   public void menuDogs(){
       boolean exit = false;
       while(!exit){
           System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄ ");
           System.out.println("     ****   ****   *****  *****");
           System.out.println("     *   *  *  *   * ***  *****");
           System.out.println("     *   *  *  *   *   *      *");
           System.out.println("     ****   ****   *****  *****");
           System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄ ");
           System.out.println(" ");
           System.out.println("Choice: ");
           System.out.println("1. Make a dog.");
           System.out.println("2. See print the list.");
           System.out.println("3. Remove a dog from the list.");
           System.out.println("4. Exit.");
           System.out.println(" ");
           
       int number = leer.nextInt();
       switch (number){
           case 1: crearDog();
           break;
           case 2: imprimeScreen(dogs);
           break;
           case 3: optionEliminar();
           break;
           case 4: exit = true;
           System.out.println("THE END`s.");
           break;
           default: System.out.println("Choice again.");
       }
       }
   }
}
