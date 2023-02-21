package entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author siduncuNotebook
 */
public class Rectangulo implements calculoFormas{
    
    private int base;
    private int altura;

    @Override
    public void calcularArea() {
        Integer resul = base*altura;
        System.out.println("El area del rectangulo es: " + resul);
    }

    @Override
    public void calcularPeri() {
        Integer resul = base*2 + altura*2;
        System.out.println("El perimetro del rectangulo es: " +resul);
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
}
