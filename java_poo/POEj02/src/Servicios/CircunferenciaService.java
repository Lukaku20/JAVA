/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class CircunferenciaService {
    
    Scanner leer = new Scanner(System.in);
    public Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        System.out.println("Ingresa el valor del radio: ");
        c1.setRadio(leer.nextDouble());
        return c1;
    }
    
    public void calcularArea(Circunferencia c1){
        double area;
        area = 3.14 * (Math.pow(c1.getRadio(), 2));
        System.out.println("El área de radio: " + c1.getRadio() + 
                " es de: " + area);
    }
    
    public void calcularPerimetro(Circunferencia c1){
        double perimetro;
        perimetro = 2 * 3.14 * c1.getRadio();
        System.out.println("El perímetro es: " + perimetro);
        
    }
}
