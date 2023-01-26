/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poejex02;

import Entidad.Puntos;
import Servicios.ServicePuntos;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class POEjEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ServicePuntos serPun = new ServicePuntos();
    Puntos puntos = serPun.crearPuntos();
    Scanner leer = new Scanner(System.in);
    
        System.out.println("¿Desea saber la distancia entre ambos puntos?");
        System.out.println("s/n");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("s")){
            System.out.println("d(P1,P2)= " + serPun.calcularDistancia(puntos));
        }
    
    }
    
}
