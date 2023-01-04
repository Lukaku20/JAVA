/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poej05;

import Entidad.Cuenta;
import Servicios.CuentaService;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class POEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CuentaService cuentaSer = new CuentaService();
        Cuenta nuevaCuenta = cuentaSer.crearCuenta();
        double ingreso;
        double retiro;
        System.out.println("Desea ingresar dinero. s/n");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("s")){
            System.out.println("¿Cuanto dinero desea ingresar?");
            ingreso = leer.nextDouble();
            cuentaSer.ingresarDinero(ingreso, nuevaCuenta );
            
        }
        System.out.println("Desea retirar dinero. s/n");
        String responde = leer.next();
        if (responde.equalsIgnoreCase("s")){
            System.out.println("¿Cuanto dinero desea retirar?");
            retiro = leer.nextDouble();
            cuentaSer.retirarDinero(retiro, nuevaCuenta );
            
        }
        System.out.println("Desea hacer extraccion rápida. s/n");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("s")){
             cuentaSer.extraccionRapida(nuevaCuenta);
        }
       
        cuentaSer.consultarSaldo(nuevaCuenta);
        cuentaSer.consultarDatos(nuevaCuenta);
        
       
    }
    
}
