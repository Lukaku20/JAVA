/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejapex24;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class IntroJavaEjApEx24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el número para la sucesion de Fibonacci.");
        int a = leer.nextInt();
        int [] fibonacci = new int[a];
        for (int i = 0; i < a; i++) {
            if (i == 0 || i ==1){
                fibonacci[i]= 1;   
            } else{
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];                
        }
        }
        System.out.println("La sucesiòn fibonacci para:");
        System.out.print(a + " = ");
        for(int j = 0; j < a; j++) {
            if(j<a-1){
            System.out.print(fibonacci[j] + " + ");
        }else{
                System.out.println(fibonacci[j]);
            }   
        }
}
}
