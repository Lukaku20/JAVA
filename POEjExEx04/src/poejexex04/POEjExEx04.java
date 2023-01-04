/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poejexex04;

//import Entida.Fecha;
import Entida.Fecha;
 import Servicios.ServiceFecha;
import java.util.Date;

/**
 *
 * @author lukaku20
 */
public class POEjExEx04 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceFecha dayMonYear = new ServiceFecha();
        Fecha nueva = dayMonYear.colocarFecha();
        
        Date fecha = new Date();
        System.out.println("La Fecha actual en el sistema: " + fecha);
        
        System.out.println("La Fecha que ingresaste es: ");
        System.out.println(nueva.toString());
        System.out.println("El año ingresado se encuentra entre 1900 y 2022: "
        + dayMonYear.verificarAnio(nueva));
        System.out.println("Usted ingresó el mes " + dayMonYear.pasarMes(nueva));
        System.out.println("Ese mes tiene: " + dayMonYear.cantidadDias(nueva)+ " dias.") ;
        System.out.println("¿El año es bisiesto? " + dayMonYear.determinarBisiesto(nueva));
        if(dayMonYear.determinarBisiesto(nueva)){
            System.out.println("Se agrega un dia, febrero tiene 29 dias.");
        }
        
    }
    
}
