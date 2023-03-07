/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
*/

package com.mycompany.java_excepciones_05;

import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class Java_excepciones_05 {
public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        int contador =0;
        int sorteo = (int) (Math.random() * 9 + 1);
        boolean adivino=false;
        
        do{
            try{           
                System.out.println("Adivina un numero entre 1 y 10 ¿Cual es?");
                int intento = scan.nextInt();
                contador++;
                if(intento==sorteo){
                    System.out.println("Adivinó.");
                    adivino=true;
                    
                } else{
                    adivino=false;
                    System.out.println("Segui intentando");
                }
                
                
            }catch(Exception e){
                System.out.println("El intento no fue un numero.");
                scan.next();     
               }    
            }while(adivino==false);
          System.out.println("Haz adivinado en: " + contador + " intentos.");  
        }
        
    }
    
//    public static void intentar(int contador,int sorteo, boolean adivino){
//        
//    }

