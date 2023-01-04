/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class PersonaService {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona A = new Persona();
        System.out.println("Colocamos el nombre de la persona.");
        A.setNombre(leer.next());
        System.out.println("¿Cual es la fecha de nacimiento?");
        A.setNacimiento(LocalDate.of(leer.nextInt(), leer.nextInt(), leer.nextInt()));
        return A;
    }
    public void calcularEdad(Persona A){
        System.out.println("La edad de la persona indicada es: "
        + LocalDate.now().compareTo(A.getNacimiento()));
        System.out.println("La edad, confirmada es: "
                + LocalDate.now().until(A.getNacimiento()));
    }
    public boolean menorQue(int i, Persona A){
        int edad = LocalDate.now().compareTo(A.getNacimiento());
        return i< edad;
    }
    public void mostrarPersona(Persona A){
        System.out.println(A.toString());
    }
    
    
//    public Persona crearPersona(){
//        Persona p1 = new Persona();
//        Date nacimiento = new Date();
//        System.out.println("Ingresa su nombre: ");
//        p1.setNombre(leer.next());
//        System.out.println("Su fecha de nacimiento: ");
//        System.out.println("Dia");
//        nacimiento.setDate(leer.nextInt());
//        System.out.println("Mes");
//        nacimiento.setMonth(leer.nextInt());
//        System.out.println("Año");
//        nacimiento.setYear(leer.nextInt());
//        System.out.println("Los datos están completos.");
//        return;
//         
    


  
}
