/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entida.Triangulo;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class TrianguloService {
    Scanner leer = new Scanner(System.in);
    public Triangulo crearIsoceles(){
        Triangulo a = new Triangulo();
        System.out.println("Ingresa la medida de los lados iguales: ");
        double medida = leer.nextDouble();
        a.setLadoA(medida);
        a.setLadoB(medida);
        System.out.println("Ahora la medida del lado diferente: ");
        a.setLadoC(leer.nextDouble());
        
        return a;
    }
    
    public void mostrar(Triangulo a){
        System.out.println(a.toString());
    }
    
    public void calculoPeri_metro(Triangulo a){
        double resultado = a.getLadoA()+a.getLadoB()+a.getLadoC();
        a.setPerimetro((float)resultado);
//        System.out.println("El cálculo del perímetro dio: " +a.getPerimetro());
    }
    
    public void calculoA_rea(Triangulo a){
        double altura, base, area, hipotenusa, cateto1;
        double cateto2 = a.getLadoC()/2;
        base = a.getLadoC();
         //Math.pow(a.getLadoA(), 2) - Math.pow(cateto2, 2);
        hipotenusa = Math.hypot(a.getLadoA(), cateto2);
        a.setHipotenusa(redondearFloat((float)hipotenusa));
        //altura = Math.pow(hipotenusa, 2) = Math.pow(cateto2, 2) ;
        //hipotenusa2 = c2 + c2
//        
//        System.out.println("La hipotensua del triangulo dio: " + hipotenusa);
//        System.out.println("En este caso es: LA ALTURA!!!");
        area = (hipotenusa * base )/2;
        a.setArea(redondearFloat((float)area));
//        System.out.println("EL Area del triangulo dio: "+a.getArea()+" cm2.");
    }
    
    public double redondearFloat(double z){
        double r1 = Math.round(z*100);
        double r2 = r1 / 100;
        return r2;
    }
    public void asignarId(Triangulo[] a){
        String [] id = new String[]{"alpha","bêta","gamma","delta"};
        for (int i = 0; i < 4; i++) {
            String aux = id[i];
            a[i].setId(aux);
    }
}
}
