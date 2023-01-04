/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author lukaku20
 */
public class Circunferencia {
    //atributo radio
    private static double radio;
    //constructor con parametro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    //Constructor por defecto
    public Circunferencia() {
        
    }
    //getter
    public double getRadio() {
        return radio;
    }
    //setter
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
}
