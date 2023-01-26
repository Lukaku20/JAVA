/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poejex03;

import Entidad.Raices;
import ServiceRaices.ServiceRaices;

/**
 *
 * @author lukaku20
 */
public class POEjEx03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceRaices serRai = new ServiceRaices();
        Raices raiz = serRai.crearRaiz();
        
        System.out.println("El discriminante es: "+ serRai.getDiscriminante(raiz));
    }
    
}
