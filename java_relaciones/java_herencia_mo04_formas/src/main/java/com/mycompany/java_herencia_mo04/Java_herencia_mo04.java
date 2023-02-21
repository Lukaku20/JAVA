/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_herencia_mo04;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author siduncuNotebook
 */
public class Java_herencia_mo04 {

    public static void main(String[] args) {
        
        Rectangulo r = new Rectangulo(22,18);
        Circulo c = new Circulo(3);
        System.out.println(" ");
        System.out.println("Se calculan el perimetro y el area del rectangulo y del circulo");
        System.out.println(" ");
        r.calcularArea(); r.calcularPeri();
        System.out.println(" ");
        c.calcularArea(); c.calcularPeri();
        System.out.println("---");
    }
}
