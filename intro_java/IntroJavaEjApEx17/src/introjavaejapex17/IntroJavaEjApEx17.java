/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejapex17;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IntroJavaEjApEx17 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        boolean esPrimo;
        System.out.println("Solicito digas un Número que deseas saber si es Primo.");
        numero = leer.nextInt();
        System.out.println("Aqui dice si Número es primo.");
        esPrimo = determinaNumPri(numero);
        if (esPrimo) {
            System.out.println("El numero: (" +numero+ ") es primo.");
            
        }else{
            System.out.println("El numero: (" + numero+ ") NO es primo.");
        }
        
        
    }//metodoMain
    public static boolean determinaNumPri(int num){
        int cont = 0; 
        for (int i = 1; i < (num+1); i++) {
            if (num%i == 0){
                cont++;
            } 
            
        }
        return cont == 2;
    }//booleandeterminaNumPri
    }
