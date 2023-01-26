/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entida;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Sopa {
    
    String[][] matrix;
    String palabraEncontrar;
    String [] palabrasEncontradas;

    public Sopa() {
        this.palabrasEncontradas = new String[5];
    }

    public Sopa(String[][] matrix, String palabraEncontrar, String[] palabrasEncontradas) {
        this.matrix = matrix;
        this.palabraEncontrar = palabraEncontrar;
        this.palabrasEncontradas = palabrasEncontradas;
    }

    public String[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(String[][] matrix) {
        this.matrix = matrix;
    }

    public String getPalabraEncontrar() {
        return palabraEncontrar;
    }

    public void setPalabraEncontrar(String palabraEncontrar) {
        this.palabraEncontrar = palabraEncontrar;
    }

    public String[] getPalabrasEncontradas() {
        return palabrasEncontradas;
    }

    public void setPalabrasEncontradas(String[] palabrasEncontradas) {
        this.palabrasEncontradas = palabrasEncontradas;
    }

   

    @Override
    public String toString() {
        return "Sopa de Letras - palabraEncontrar:" + palabraEncontrar + " palabrasEncontradas: " 
                + Arrays.toString(palabrasEncontradas) ;
    }


    
}
