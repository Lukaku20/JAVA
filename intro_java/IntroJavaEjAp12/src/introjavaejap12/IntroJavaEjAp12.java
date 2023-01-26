/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejap12;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEjAp12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Este programa simula un dispositivo"
                + " RS232, lee cadenas enviadas por el usuario");
        System.out.println("Las cadenas deben tener 5 caracteres, y"
                + " comenzar con X y terminar con O. ");
        System.out.println("Envia cadenas: ");
        String cadena, cadenaTotal, FDE;
        FDE =  "&&&&&";
        cadenaTotal = " ";
        int correctas, incorrectas;
        correctas = -1;
        incorrectas = 0;
        while (true) {
             cadena = leer.nextLine();
        if (cadena.length() == 5){
            correctas++;
            cadenaTotal = (cadenaTotal + ", " + cadena);          
            
        } else{
            incorrectas++;
        } if (cadena.equals(FDE)){
            System.out.println("El total de correctas: " + correctas);
            System.out.println("El total de incorrectas: " + incorrectas);
            System.out.println("Las cadenas impresas: " + cadenaTotal);
            break;
        } 
        }     
                
    }
    
}
