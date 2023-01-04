/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CuentaService {
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
       System.out.println("Primero, tendremos que validar su CUENTA");
       Cuenta c1 = new Cuenta();
       System.out.println("Ingresa nº de CUENTA");
       c1.setNumero(leer.nextInt());
       System.out.println("Ingrese su DNI");
       c1.setDni(leer.nextLong());
       System.out.println("Deposite el DINERO a su cuenta");
       c1.setSaldo(leer.nextInt());
       return c1;
    }
    
    public Cuenta ingresarDinero(double ingreso, Cuenta cuenta){
        System.out.println("El dinero disponible era: " + cuenta.getSaldo());
        cuenta.setSaldo((cuenta.getSaldo() + (int) ingreso));
        System.out.println("Su nuevo saldo es: " + cuenta.getSaldo());
        return cuenta;
    }
    public Cuenta retirarDinero(double retiro, Cuenta cuenta){
        if(retiro>= cuenta.getSaldo()){
            System.out.println("Usted pudo retirar: " + -cuenta.getSaldo());
            cuenta.setSaldo(0);
            System.out.println("Su nuevo saldo es 0 (cero)");
        }else{
        System.out.println("El dinero disponible era: " + cuenta.getSaldo());
        cuenta.setSaldo((cuenta.getSaldo() - (int) retiro));
        System.out.println("Su nuevo saldo es: " + cuenta.getSaldo());
        
        }
        return cuenta;
    }
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("Su saldo actual es: " + cuenta.getSaldo());
    }
    public void consultarDatos(Cuenta cuenta){
        System.out.println("Nº de cuenta: "+ cuenta.getNumero());
        System.out.println("D. N. I. : " + cuenta.getDni());
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
    
    public void extraccionRapida(Cuenta cuenta){
        double cta = cuenta.getSaldo();
        System.out.println("Usted disponde de: "+ (cta*0.2));
        System.out.println("¿Cuánto desea extraer?");
        int ask = leer.nextInt();
        boolean valido = ask<= cta*0.2;
        if(valido){
            System.out.println("Usted retira: "+ask);
            cuenta.setSaldo((int)cta-ask);
        } else{
            System.out.println("NO corresponde con el límite.");
        }
    }
}
