/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poejexex06;

import Entida.Sopa;
import Servicios.SopaService;

/**
 *
 * @author lukaku20
 */
public class POEjExEx06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SopaService servicio = new SopaService();
        Sopa soup = new Sopa();
        do{
        servicio.iniciarMatriz(soup);
//      servicio.mostrarSoup(soup);
        
        servicio.iniciarPalabrasaBuscar(soup);
        System.out.println(" _  _   _   _ ");
        System.out.println("|_ | | |_) /\\  ");
        System.out.println(" _||_| |  /--\\ ");
        System.out.println(" de letras  ▲   ");
        System.out.println(" ");
        servicio.completarConLetras(soup);
        
        System.out.println(" ");
        System.out.println(" Intenta encontrar las palabras ocultas.");
        System.out.println(" ");
        System.out.println(" ");
        servicio.mostrarSoup(soup);
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            servicio.intentarAdivinar(soup, i);
            
        }
        servicio.evaluar(soup);
    } while (servicio.jugarDeNuevo());
    }
}
    

