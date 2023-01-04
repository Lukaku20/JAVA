/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class ServicePuntos {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos p1 = new Puntos();
        System.out.println("Ingresa las coordenadas del punto 1:");
        p1.setX1(leer.nextInt());
        p1.setY1(leer.nextInt());
        System.out.println("Luego, ingresa las coodenadas del punto 2:");
        p1.setX2(leer.nextInt());
        p1.setY2(leer.nextInt());
        System.out.println("Listo, los datos están completos.");
        return p1;
    }
    
    public double calcularDistancia(Puntos p1){
        int x1 = p1.getX1();
        int x2 = p1.getX2();
        int y1 = p1.getY1();
        int y2 = p1.getY2();
        return Math.sqrt(Math.pow(x2 - x1, 2)+Math.pow(y2 - y1, 2));
        
    }
}
