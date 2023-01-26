/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejapex13;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEjApEx13 {

    /** Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int a, cont;
        System.out.println("¿En que cifra deseas terminar la escalera?");
        a = leer.nextInt();
        System.out.println("___________________");
        System.out.println(" ");
        cont = 1;
        String aux;
        String cadena = "";
        while (cont < a+1){
            aux = String.valueOf(cont);
            cadena = cadena+aux;
            System.out.println(cadena);
            cont++;
        }
    }
    
}
