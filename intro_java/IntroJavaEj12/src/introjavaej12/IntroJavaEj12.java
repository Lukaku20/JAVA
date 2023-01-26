/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaej12;

import java.util.Scanner;
        
/**
 *
 * @author usuario
 */
public class IntroJavaEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa dos numeros por pantalla"
                + "para determinar si el primero es multiplo del segundo");
        int a, b;
        a = leer.nextInt();
        b = leer.nextInt();
        esMultiplo(a, b);
    }
    public static void esMultiplo(int a,int b){
        
        int c, count;
        c = 0; count = 1;
        while(c < b){
            c = a * count;
            count++; 
        }
        if (c == b){
            System.out.println(a + " es multiplo de " + b);
            
        } else{
            System.out.println("No son multiplos");
        }
    }
}
