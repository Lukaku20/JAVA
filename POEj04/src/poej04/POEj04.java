/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poej04;

import Entidad.Rectangulo;
import Servicios.RectanguloService;

/**
 *
 * @author lukaku20
 */
public class POEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RectanguloService recSer = new RectanguloService();
        Rectangulo rec1 = recSer.crearRectangulo();
        
        double perimetro = recSer.calcularPerimetro(rec1);
        double superficie = recSer.calcularSuperficie(rec1);
        
        System.out.println("La superficie es: "+ superficie);
        System.out.println("El perímetro es: "+ perimetro);
        
        recSer.dibujarRectangulo(rec1);
        
    }
    
}
