/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosALaObra;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class condicionMayorA {

    /**
     *El programa debe determinar si entre dos numeros que son ingresados por 
     * el usuario, alguno o ambos son mayores a 25.
     * @param args
     */
    public static void main(String[] args) {
        // Debo llamar a Scanner para poder generar entrada
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos numeros por pantalla");
        int a, b;
        a = leer.nextInt();
        b = leer.nextInt();
        if (a >= 25 || b >= 25){
            System.out.println("Ambos o alguno de ellos "
                    + "es mayor o igual a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
    }
    
}
