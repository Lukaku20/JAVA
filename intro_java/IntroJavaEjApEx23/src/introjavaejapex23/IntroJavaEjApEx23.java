/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejapex23;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class IntroJavaEjApEx23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String [] apalabras = new String [5];
        String [][] sopaDePalabras = new String [20][20];
        
        
        System.out.println("Debes ingresar 5 palabras de entre 3 y 5 caracteres.");
        for (int i = 0; i < 5; i++) {
        apalabras[i] = leer.nextLine();   
        }
        System.out.println("Ahora agregaremos las palabras a la SOPA.");
        inicializarSopa(sopaDePalabras);
        /*for (int i = 0; i < 5; i++) {
            int cont = 1;
            agregarPalabra(sopaDePalabras, apalabras[i], cont);
            cont++;*/
        for (int i = 0; i < 5; i++) {
            int cont = (int)(Math.random()*10);
            agregarPalabra(sopaDePalabras, apalabras[i], cont);
            
        }
        mostrarSopa(sopaDePalabras);
       
       
       
                
    }
    public static void agregarPalabra(String[][] sopaDePalabras, String palabra, int cont){
        int len = palabra.length();
        int b = (int)(Math.random()*10);
        for (int i = 0; i < len; i++) {
            sopaDePalabras[cont][i+b] = palabra.substring(i,i+1);                  
            
        }
    }
    public static void mostrarSopa(String[][] sopaDePalabras){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" "+sopaDePalabras[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void inicializarSopa(String[][] sopaDePalabras){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                //int a = (int) (Math.random()*10);
                //String random = String.valueOf(a);
                sopaDePalabras[i][j] = "*";//random;
            }
            
        }
    }
            
}
