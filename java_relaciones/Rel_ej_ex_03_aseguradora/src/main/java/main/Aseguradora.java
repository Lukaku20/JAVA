/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import Servicios.ServiceCliente;
import Servicios.ServiceCuota;

/**
 *
 * @author siduncuNotebook
 */
public class Aseguradora {

    public static void main(String[] args) {
        System.out.println("LA TERCERA SEGUROS");
        
        ServiceCuota callCuota = new ServiceCuota();
        ServiceCliente callCliente = new ServiceCliente();
        callCuota.menuCuota();
        callCliente.crearCliente();
        callCliente.mostrarCliente();
        
    }
}
