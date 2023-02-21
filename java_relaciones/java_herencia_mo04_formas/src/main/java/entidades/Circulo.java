package entidades;


import entidades.calculoFormas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author siduncuNotebook
 */
public class Circulo implements calculoFormas{
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        Double resul = pi*radio*radio;
        System.out.println("El area del circulo es: " + resul);
    }

    @Override
    public void calcularPeri() {
        Double resul= radio*2*pi;
        System.out.println("El perimetro del circulo es: "+ resul);
    }
}
