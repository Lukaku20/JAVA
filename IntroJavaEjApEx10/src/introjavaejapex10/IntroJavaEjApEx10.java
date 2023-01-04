/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejapex10;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEjApEx10 {

    /**. Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int a, b, c;
        int num;
        a = (int)(Math.random()*10);
        b = (int)(Math.random()*10);
        c = a*b;
        num = 9999;
         System.out.println("Ingresa el numero que creas que es el numero resultante: ");
        while (num!=c){
             num = leer.nextInt();
             if (num==c){
                 System.out.println("Perfecto, acertaste!!!");
                 System.out.println("La cuenta fue: ");
                 System.out.print(a);
                 System.out.print(" x ");
                 System.out.print(b);
                 System.out.print(" = ");
                 System.out.println(c);
             }else{
                 System.out.println("Vuelve a intentarlo");
             }
        }
        
    }
    
}
