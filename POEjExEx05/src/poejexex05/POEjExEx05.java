/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poejexex05;

import Entida.Triangulo;
import Servicios.TrianguloService;

/**
 *
 * @author lukaku20
 */
public class POEjExEx05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TrianguloService triSer = new TrianguloService();
        
        Triangulo[] a = new Triangulo[4];
        System.out.println("⌂");
        System.out.println("Vamos a crear 4 triángulos isosceles.");
        //Crear los isosceles.
        for (int i = 0; i < 4; i++) {
           a[i] = triSer.crearIsoceles();
           triSer.calculoPeri_metro(a[i]);
           triSer.calculoA_rea(a[i]);
            
        }
        triSer.asignarId(a);
        
        for (int i = 0; i < 4; i++) {
            triSer.mostrar(a[i]);
        }
        
        
    }
    
}
