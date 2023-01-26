/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poejex06;

import Entidad.Ahorcado;
import Servicios.ServiceAhorcado;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class POEjEx06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServiceAhorcado servicio = new ServiceAhorcado();
        Ahorcado ahorcado = servicio.crearJuego();
        
        while (ahorcado.getIntentos()>0){
            System.out.println("Intenta adivinar una letra");
            String letra = leer.next();
            servicio.buscar(letra, ahorcado);
        }
        
    }
    
}
