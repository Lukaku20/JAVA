/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poej06;

import Entidad.Cafetera;
import Servicios.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class POEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CafeteraService cafeta = new CafeteraService();
        Cafetera cafetera = new Cafetera();
        
        System.out.println("¿Cual es la capacidad máxima de la cafetera?");
        cafetera.setCantidadMax(leer.nextInt());
        System.out.println("¿Desea llenar la cafetera? s/n");
        String resp = leer.next();
        if(resp.equalsIgnoreCase("s")){
            cafeta.llenarCafetera(cafetera);
        }
        System.out.println("¿Desea servirse? s/n");
        String res = leer.next();
        if(res.equalsIgnoreCase("s")){
            System.out.println("¿Què tamaño tiene la taza?");
            int taza = leer.nextInt();
            cafeta.servirTaza(taza, cafetera);
        }
        System.out.println("¿Desea vaciar la cafetera? s/n");
        String respuesta = leer.next();
        if(respuesta.equalsIgnoreCase("s")){
            cafeta.vaciarCafetera(cafetera);
        }
        System.out.println("¿Cuanto cafe desea agregar?");
        int cafe = leer.nextInt();
        cafeta.agregarCafé(cafe, cafetera);
    }
    
}
