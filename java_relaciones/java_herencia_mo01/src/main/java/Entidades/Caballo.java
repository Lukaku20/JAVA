/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author siduncuNotebook
 */
public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Caballo() {
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Re  bp bp  chim");
    }
    @Override
    public void seAlimentaDe() {
        System.out.println("Yo soy "+ super.getAlimento()+ ". ");
    }
}
