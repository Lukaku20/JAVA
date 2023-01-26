
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class notaCorrecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingresa una nota entre 1 y 10");
        nota = leer.nextInt();
        while (nota < 1 || nota > 10){
            System.out.println("Ingresa una nota que sea válida");
            nota = leer.nextInt();
        }
        System.out.println(nota + " es una nota válida. ");
                
    }
    
}
