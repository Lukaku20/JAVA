/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author siduncuNotebook
 */
public class Gato extends Animal{

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Gato() {
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Miau.");
    }
    @Override
    public void seAlimentaDe() {
        System.out.println("Yo como "+ super.getAlimento()+ ". ");
    }
}
