/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cafetera;

/**
 *
 * @author lukaku20
 */
public class CafeteraService {
    
    public Cafetera llenarCafetera(Cafetera cafetera){
       cafetera.setCantidadActual(cafetera.getCantidadMax());
        System.out.println("La cafetera se llenó de café"
        + ", tiene: " + cafetera.getCantidadActual() + "cc3.");
       return cafetera;
    }
    public void servirTaza(int taza, Cafetera cafetera){
        System.out.println("La taza contiene: " + taza + " cc3.");
        boolean invalido = taza > cafetera.getCantidadActual();
        if(invalido){
            System.out.println("La taza sólo se podrá llenar con: "+ cafetera.getCantidadActual());
            System.out.println("Faltaron: " + (taza - cafetera.getCantidadActual()));
            cafetera.setCantidadActual(0);
            System.out.println("La cantidad de café en cafetera es: 0");
        } else{
            System.out.println("Se llenó.");
            cafetera.setCantidadActual(cafetera.getCantidadActual()-taza);
            System.out.println("En la cafetera queda: "+ cafetera.getCantidadActual()+" cc3.");
        }
    }
    public Cafetera vaciarCafetera(Cafetera cafetera){
       cafetera.setCantidadActual(0);
        System.out.println("La cafetera se vació de café");
       return cafetera;
    }
    public void agregarCafé(int cantidad, Cafetera cafetera){
        cafetera.setCantidadActual(cantidad);
        System.out.println("La cantidad de café ha sido agregada: " + cafetera.getCantidadActual());
        
    }
}
