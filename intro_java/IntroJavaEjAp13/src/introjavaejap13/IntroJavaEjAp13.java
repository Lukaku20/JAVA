/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejap13;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEjAp13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("El programa imprime un cuadrado con la cantidad"
                + "de * por el numero ingresado");
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        for (int i = 0; i < numero; i++){
            for(int j = 0; j < numero; j++){
                if ((i > 0) && (i < numero-1) && (j > 0) && (j < numero-1)){
                    System.out.print("   ");
                } else{
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
