/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaej8;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int num, contador, suma;
        contador = 0;
        suma = 0;
        do {
            num = leer.nextInt();
            contador++;
            if (num != 0){ 
                if (num < 0){
                } else {
                    suma = suma + num;
                }
                              
            } else{
                System.out.println("Se capturó el numero CERO (0)");
                break;
            } 
        } while (contador < 20);
        System.out.println("La suma total dio " + suma);
    }
    
}
