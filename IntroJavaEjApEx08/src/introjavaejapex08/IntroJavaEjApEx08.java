/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejapex08;

import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class IntroJavaEjApEx08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int num = 4;
        
        while(num % 5 != 0){
            System.out.println("Ingresar un numero");
            num = leer.nextInt();
            if (num < 0 || num % 5 == 0){
                
            }else if (num % 2 == 0){
                pares++;
            } else{
                impares++;
            }
            
        }
        System.out.println("PARES: " + pares);
        System.out.println("IMPARES: " + impares);
        System.out.println("Cantidad de numeros: " +(pares+impares));
    }
    
}
