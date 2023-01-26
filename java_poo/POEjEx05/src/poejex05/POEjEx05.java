/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poejex05;

import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class POEjEx05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String [] doceMeses = new String [12];
        doceMeses[0] = "enero";
        doceMeses[1] = "febrero";
        doceMeses[2] = "marzo";
        doceMeses[3] = "abril";
        doceMeses[4] = "mayo";
        doceMeses[5] = "junio";
        doceMeses[6] = "julio";
        doceMeses[7] = "agosto";
        doceMeses[8] = "septiembre";
        doceMeses[9] = "octubre";
        doceMeses[10] = "noviembre";
        doceMeses[11] = "diciembre";
        int i = (int) (Math.random() * 10);
        String mesSecreto = doceMeses[i];
        System.out.println("Adivine el mes secreto");
        System.out.println("Introduzca el mes: ");
        String resp;
        do{
            resp = leer.next().toLowerCase();
        if( mesSecreto.equals(resp)){
            System.out.println("Haz adivinado");
        } else {
            System.out.println("Sigue probando");
        } 
        
    }while (!mesSecreto.equals(resp));
    
}
}
