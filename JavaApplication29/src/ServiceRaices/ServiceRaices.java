/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceRaices;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class ServiceRaices {
    Scanner leer = new Scanner(System.in);
    public Raices crearRaiz(){
        Raices raiz = new Raices();
        System.out.println("Ingresa el valor para los 3 coeficientes: a, b y c. ");
        raiz.setA(leer.nextInt());
        raiz.setB(leer.nextInt());
        raiz.setC(leer.nextInt());
        return raiz;
    }
    
    public double getDiscriminante(Raices raiz){
        double a = raiz.getA();
        double b = raiz.getB();
        double c = raiz.getC();
        return  (Math.pow(b, 2))- (4*a*c);
    }
    
}
