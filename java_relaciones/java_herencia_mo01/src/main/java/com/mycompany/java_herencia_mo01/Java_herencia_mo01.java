

package com.mycompany.java_herencia_mo01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;


public class Java_herencia_mo01 {

    public static void main(String[] args) {
        
        Animal a1 = new Animal("Lucho", "omnivoro", 34, "hombre");
        Animal p1 = new Perro("Ayrton", "carnivoro", 13, "setter");
        Animal g1 = new Gato("Frida", "enlatados", 7, "simmens");
        Animal c1 = new Caballo("Trueno", "hervíboro", 17, "árabe");
        ArrayList<Animal> listaDeAnimales = new ArrayList<>();
        
        listaDeAnimales.add(g1);
        listaDeAnimales.add(p1);
        listaDeAnimales.add(a1);
        listaDeAnimales.add(c1);
        System.out.println(" ");
        System.out.println(" ** Mi lista de animales ** "+"\n");
        for (Animal lista : listaDeAnimales) {
            lista.meLlamo(lista);
            System.out.println(" digo: " ); 
            lista.hacerRuido();
            lista.seAlimentaDe();
            System.out.println(" ");
        }
    }
}
