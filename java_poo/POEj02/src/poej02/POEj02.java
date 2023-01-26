/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poej02;

import Entidades.Circunferencia;
import Servicios.CircunferenciaService;

/**
 *
 * @author lukaku20
 */
public class POEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CircunferenciaService circunSer = new CircunferenciaService();
        Circunferencia c1 = circunSer.crearCircunferencia();
        
        circunSer.calcularArea(c1);
        circunSer.calcularPerimetro(c1);
    }
    
}
