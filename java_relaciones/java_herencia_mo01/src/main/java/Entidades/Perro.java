/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author siduncuNotebook
 */
public class Perro extends Animal{

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Perro() {
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Guau.");
    }
    @Override
    public void seAlimentaDe() {
        System.out.println("Yo soy "+ super.getAlimento()+ ". ");
    }
}
