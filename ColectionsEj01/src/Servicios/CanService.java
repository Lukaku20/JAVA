
package Servicios;

import Entida.Can;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */

public class CanService {
   public Scanner leer = new Scanner(System.in);
    public Can crearDog(){
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
        return poo;
    }
    
    public void asignarNumber(ArrayList<Can> dogs){
        
        for (Can dog : dogs){
            
            dog.setNumer(dogs.indexOf(dog));
            
        }
    }
   public void eliminarDog(ArrayList<Can> dogs){
       
       for (Can dog: dogs){
           System.out.println("Perro: "+ dog.getNumer());
       }
       int position = leer.nextInt();
       dogs.remove(position);
   }
    
}
