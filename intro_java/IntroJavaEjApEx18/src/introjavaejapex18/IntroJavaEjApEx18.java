/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejapex18;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEjApEx18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de cifras participantes");
        int cifra = leer.nextInt();
        int[] vector;
        int suma = 0;
        vector = new int[cifra];
        System.out.println("Coloca las cifras de a una y dar Enter");
        for (int i = 0; i < cifra; i++) {
            vector[i] = leer.nextInt();                   
            suma += vector[i];
        }
        System.out.println("La cifra total da: " + suma + ". Entre "+cifra);
        
    
    
}//metodoMain
}