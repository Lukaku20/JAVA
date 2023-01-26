/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaej10;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa un numero por pantalla");
            numero = leer.nextInt();
            System.out.print(numero);
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
