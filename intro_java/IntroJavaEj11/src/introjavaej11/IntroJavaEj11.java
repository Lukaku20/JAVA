/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaej11;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa una frase cualquiera");
        String frase = leer.nextLine().toLowerCase();
        System.out.println("La frase traducida es: " + nuevaFrase(frase));
    }
    public static String nuevaFrase (String frase){
        String nuevaFase;
        nuevaFase = "";
        char letra;
        int longitud = frase.length();
        for (int i = 0; i < longitud; i++){
            letra = frase.charAt(i);
            switch (letra){
                case 'a':
                    letra = '@';
                    break;
                case 'e':
                    letra = '#';
                    break;
                case 'i':
                    letra = '&';
                    break;
                case 'o':
                    letra = '%';
                    break;
                case 'u':
                    letra = '+';
                    break;
                default:
                                 
            }
            nuevaFase = nuevaFase + letra;
        }
        return nuevaFase;

}
}

