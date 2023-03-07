/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_excepciones_06;

/**
 *
 * @author siduncuNotebook
 */
public class Java_excepciones_06{

    public static void main(String[] args) {
        metodoA();

    }
    
    public static void metodoA(){
        System.out.println(" ");
        System.out.println("sentencia_a1");
        System.out.println("sentencia_a2");
        try {
            
            String a = "5c";
            int b = Integer.valueOf(a);
            System.out.println("sentencia_a3");
            System.out.println("sentencia_a4");
        } catch (Exception e) {
            System.out.println(" ");
            System.out.println("sentencia_a6");
        }
        finally{
            System.out.println("Yo siempre voy a estar!!!");
        }
        System.out.println("sentencia_a5");
    }
}

