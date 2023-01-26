/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaej13;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("¿Cuantos miembros son en el grupo?");
        int m = leer.nextInt();
        String[] grupo = new String[m];
        System.out.println("Ingresa el nombre de cada participante.");
        grupo[0] = leer.nextLine();
        for (int i = 0; i < m; i++){
            grupo[i] = leer.nextLine();
        }
        System.out.println("Perfecto, los miembros del grupo son: ");
        for (int i = 0; i < m; i++){
            System.out.println((i+1) + "/" + ". " + grupo[i]);
        }
    }
    
}
