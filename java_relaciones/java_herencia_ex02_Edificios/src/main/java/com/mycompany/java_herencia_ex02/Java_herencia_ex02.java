
package com.mycompany.java_herencia_ex02;

import Entidades.Edificio;
import Entidades.EdificioOficina;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lukaku20
 */
public class Java_herencia_ex02 {
    
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        //crear la arraylist de edificio
        ArrayList<Edificio> edificios = new ArrayList<>();
        //instanciar los polideportivo y edificios de oficinas
        Edificio a = new Polideportivo("Villa Hipódromo", true, 120d, 80d, 30d);
        Edificio b = new EdificioOficina(6, 20, 5, 20d, 30d, 18d);
        Edificio c = new Polideportivo("Ribosqui", false, 200d, 250d, 25d);
        Edificio d = new EdificioOficina(4, 10, 10, 20d, 40d, 30d);
        edificios.add(d);edificios.add(c);edificios.add(b); edificios.add(a);
        
        //calculo de superficie y volumen
        for (Edificio edificio : edificios) {   
            if(edificio instanceof Polideportivo){
                System.out.println("Polideportivo " + ((Polideportivo) edificio).getNombre());
            } else{
                System.out.println("Edificio de Oficinas: ");
            };
            System.out.println(edificio.toString());
            System.out.println("Superficie: " + edificio.calcularSuperficie() + "mt2.");
            System.out.println("Volumen: "+ edificio.calcularVolumen()+ "mt3.");
            System.out.println("___________________");
        }
        
        //para polideportivos cuantos hay abiertos y cerrados
        int abiertos=0;
        int cerrados=0;
        for (Edificio edificio : edificios) {
            if(edificio instanceof Polideportivo){
                if(((Polideportivo) edificio).isAbierto()){
                    abiertos++;
                } else{
                    cerrados++;
                }
            }
        }
        System.out.println("La cantidad de polideportivos abiertos son: " + abiertos + "\n"
        + "cerrados son: " + cerrados);
        
        //llamar metodo cantidad de personas para edificio de oficinas
        for (Edificio edificio : edificios) {
            if(edificio instanceof EdificioOficina){
                System.out.println(edificio);
                System.out.println("El numero total de personas es: " + ((EdificioOficina) edificio).cantidadPerson());
            }
        }
    }
}
