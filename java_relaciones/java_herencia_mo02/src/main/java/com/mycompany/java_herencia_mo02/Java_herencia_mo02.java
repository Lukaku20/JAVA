

package com.mycompany.java_herencia_mo02;
import Entidades.Lavadora;


public class Java_herencia_mo02 {

    public static void main(String[] args) {
       
        
//        Electrodomestico algo = new Electrodomestico();
//        algo.consumoEnergetico(algo.getConsumo());
//        algo.comprobarColor(algo.getColor());
//        algo.precioFinal(algo.getConsumo(), algo.getPrecio());
//        algo.precioFinalII(algo.getPeso(),algo.getPrecio());

        
        Lavadora a = new Lavadora();
        a.crearLavadora();
        a.comprobarColor(a.getColor());
        a.consumoEnergetico(a.getConsumo());
        a.precioFinal(a.getConsumo(), a.getPrecio());
        System.out.println(" ");
        System.out.println(a);
        
        
    }
}
