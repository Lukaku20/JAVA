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
public class leerIgualACero {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int num, contador, suma;
        contador = 0;
        suma = 0;
        do {
            num = leer.nextInt();
            contador++;
            if (num != 0){ 
                if (num < 0){
                } else {
                    suma = suma + num;
                }
                              
            } else{
                System.out.println("Se capturó el numero CERO (0)");
                break;
            } 
        } while (contador < 20);
        System.out.println("La suma total dio " + suma);
    
    
}
}
