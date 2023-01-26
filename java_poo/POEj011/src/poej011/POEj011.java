/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poej011;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class POEj011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        int mes;
        int anio;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el dia, mes y año.");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        System.out.println(fechaActual.getYear()-fecha.getYear());
        
        
    }
    
}
