/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotas_entidades.Mascota;

/**
 *
 * @author lukaku20
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Mascota m1 = new Mascota();
        
        Scanner leer = new Scanner(System.in);
        
        
        m1.apodo = "Chiquito";
        m1.nombre = "Camilo";
        m1.tipo = "Perro";
        m1.edad = 34;
        m1.raza = "Labrador";
        m1.cola = true;
        m1.color = "Dorado";
        
        System.out.println(m1.apodo+" "+m1.edad+""+m1.tipo);
                
        
        
//    public String nombre;
//    public String apodo;
//    //Conejo, Perro, Gato, Carpincho
//    public String tipo;
//    public String color;
//    public int edad;
//    public boolean cola;
//    public String raza;
    }

}
