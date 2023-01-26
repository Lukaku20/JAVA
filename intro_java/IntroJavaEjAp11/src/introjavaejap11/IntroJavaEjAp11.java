/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejap11;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEjAp11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Bienvenido a la calculadora del programa " +
                    " ¿Qué operación deseas realizar?");
        System.out.println("Ingresa los dos numeros para la operación.");
            int a, b, c;
            boolean salir = false;
            a = leer.nextInt();
            b = leer.nextInt();
            
        do {
            
            c = 0;
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion:");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    c = a + b;
                    break;
                case 2:
                    c = a - b;
                    break;
                case 3: 
                    c = a * b;
                    break;
                case 4:
                    c = a / b;
                    break;
                case 5:   
                    System.out.println("¿Está seguro que desea salir?");
                    String seguro = leer.next();
                    salir = seguro.toLowerCase().startsWith("s");
                    break;
                default:
                    System.out.println("Esa opcion no es valida");
                            
            }
            
             if (opcion != 5) {
                 System.out.println("El resultado es: " + c);
        }
             
             
    } while(!salir);
    
}
}
