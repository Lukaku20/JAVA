/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poej10;

import java.util.Arrays;

/**
 *
 * @author lukaku20
 */
public class POEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        for (int i = 0; i < 49; i++) {
            arregloA[i] = Math.random()*100;
           
        }
        System.out.println(Arrays.toString(arregloA));
        Arrays.sort(arregloA);
        System.out.println(Arrays.toString(arregloA));
        
        //System.out.println(Arrays.toString(arregloB));
        arregloB = Arrays.copyOf(arregloA, 20);
        Arrays.fill(arregloB, 10, 20, 0.5);
        
        System.out.println(Arrays.toString(arregloB));
        

    }
    
}
