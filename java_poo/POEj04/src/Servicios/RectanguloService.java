/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class RectanguloService {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("Vamos a crear nuestro RECTANGULO:");
        Rectangulo rec1 = new Rectangulo();
        System.out.println("¿Cuál es la altura?");
        rec1.setAltura(leer.nextDouble());
        System.out.println("¿Cuál es la base?");
        rec1.setBase(leer.nextDouble());
        return rec1;
    }
    public double calcularSuperficie(Rectangulo rec1){
        double superficie;
        superficie = rec1.getAltura()*rec1.getBase();
        return superficie;
    }
    
    public double calcularPerimetro(Rectangulo rec1){
           double perimetro;
           perimetro = (rec1.getAltura()+ rec1.getBase())*2;
           return perimetro;       
   }
    public void dibujarRectangulo(Rectangulo rec1){
        int base = (int) rec1.getBase();
        int altura = (int) rec1.getAltura();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if ((i>0) && (i<altura-1) && (j> 0) && (j<base-1) ){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                    }
        }
            System.out.println(" ");
        }
    }
}

