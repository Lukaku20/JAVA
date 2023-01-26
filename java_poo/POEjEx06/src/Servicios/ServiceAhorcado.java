/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServiceAhorcado {
    public Scanner leer = new Scanner(System.in);
    public Ahorcado crearJuego(){
        String [] palabra;
        System.out.println("¿Cual es la palabra?");
        String palabraVar = leer.next();
        int lo = palabraVar.length();
        palabra = new String [lo];
        for (int i = 0; i < lo; i++) {
            palabra[i] = palabraVar.substring(i, i+1);
        }
        Ahorcado ahorcado = new Ahorcado();
        ahorcado.setPalabraBuscar(palabra);
        System.out.println("¿Cuantos intentos dispone?");
        ahorcado.setIntentos(leer.nextInt());
        ahorcado.setCantidadEncontradas(0);
        return ahorcado;
    }
    public void longitud(Ahorcado ahorcado){
        System.out.println("La longitud de la palabra es:" +ahorcado.getPalabraBuscar().length);
    }
    
    public void buscar(String letra, Ahorcado ahorcado){
      int aux = ahorcado.getPalabraBuscar().length;
      String [] a = ahorcado.getPalabraBuscar();
        for (int i = 0; i < aux; i++) {
            if (letra.equals(a[i])){
                System.out.print("La letra se encuentra en la palabra");
            } else{
                System.out.print(" ");
            }
            
        }
    }
}
