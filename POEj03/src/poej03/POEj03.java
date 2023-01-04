/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poej03;

import Entidad.Operacion;
import Servicios.OperacionService;

/**
 *
 * @author lukaku20
 */
public class POEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionService operSer = new OperacionService();
        Operacion o1 = operSer.crearOperacion();
        
        System.out.println("El resultado de la SUMA es: " + operSer.sumar(o1));
        System.out.println("El resultado de la RESTA es: " + operSer.restar(o1));
        System.out.println("El resultado de la MULTIPLICACION es: " + operSer.multiplicar(o1));
        System.out.println("El resultado de la DIVISION es: " + operSer.dividir(o1));
        
        
    }
    
}
