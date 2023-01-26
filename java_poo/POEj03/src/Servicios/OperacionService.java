/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class OperacionService {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        Operacion o1 = new Operacion();
        System.out.println("Ingresa el primer numero: ");
        o1.setNumeroUno(leer.nextInt());
        System.out.println("Ingresa el segundo numero: ");
        o1.setNumeroDos(leer.nextInt());
        return o1;
    }
    //Metodo sumar
    public int sumar(Operacion o1){
        int suma;
        suma = o1.getNumeroUno() + o1.getNumeroDos();
        return suma;
    }
    //Metodo restar
    public int restar(Operacion o1){
        int resta;
        resta = o1.getNumeroUno()- o1.getNumeroDos();
        return resta;
    }
    public int multiplicar(Operacion o1){
        boolean valido = o1.getNumeroUno() == 0 || o1.getNumeroDos() == 0;
        int resultado;
        if(valido){
            System.out.println("Ha sido un error, todo numero multiplicado por 0 da 0");
            resultado = 0;
            
        }else{
            resultado = o1.getNumeroUno() * o1.getNumeroDos();
        }
        return resultado;
    }
    public int dividir(Operacion o1){
        boolean valido = o1.getNumeroUno() == 0 || o1.getNumeroDos() == 0;
        int resultado;
        if(valido){
            System.out.println("Ha sido un error, no se puede dividir por 0");
            resultado = 0;
            
        }else{
            resultado = o1.getNumeroUno() / o1.getNumeroDos();
        }
        return resultado;
    }
}
