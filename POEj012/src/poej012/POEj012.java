/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poej012;

import Entidad.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class POEj012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PersonaService persoSer = new PersonaService();
        Persona A = persoSer.crearPersona();
        persoSer.calcularEdad(A);
        
        System.out.println("Una persona nueva, ingresa su edad: ");
        int i = leer.nextInt();
        System.out.println("La persona nueva es menor que: " + persoSer.menorQue(i, A));
        persoSer.mostrarPersona(A);
        
        
    }
    
}
