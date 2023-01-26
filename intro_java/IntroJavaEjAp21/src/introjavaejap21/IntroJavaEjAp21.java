/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejap21;

import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class IntroJavaEjAp21 {

    /**Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P.
     * @param args the command line arguments
     */ 
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizGrande = new int[10][10];
        int[][] matrizPeque = new int[3][3];

        rellenarMatrizG(matrizGrande);
        mostrarMatriz(matrizGrande, 10);
        rellenarMatrizP(matrizPeque);
        mostrarMatriz(matrizPeque, 3);

        if (compruebaSiLaContiene(matrizGrande, matrizPeque)) {
            System.out.println("Por lo tanto, la matriz está contenida.");
        } else {
            System.out.println("La buscamos y no está.");
        }
    }//metodoMain

    public static void rellenarMatrizG(int[][] matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }//metodoRellenarMatrizG

    public static void mostrarMatriz(int[][] matriz, int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println(" ");
        }
    }//metodoMostrar

    public static void rellenarMatrizP(int[][] matrizP) {
        System.out.println("Ingrese los numeros de la matriz de 3x3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = leer.nextInt();

            }

        }
    }//metodoRellenarMatrizP

    public static boolean compruebaSiLaContiene(int[][] matrizGrande, int[][] matrizPeque) {
        boolean validar = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(matrizGrande[i][j] == matrizPeque[0][0]){
                    validar = (compruebaSubMatriz(matrizGrande,matrizPeque, i, j)); 
                    if (validar){
                         System.out.println("La posicion inicial de: " + matrizGrande[i][j]
                        + " se encuentra en [" + i + ", " + j + "]");
                    }
                }
            } 
        }
        return validar;
    }//metodoCompruebaSiLaContiene
    public static boolean compruebaSubMatriz(int[][] matrizGrande, int[][] matrizPeque, int num1, int num2){
       
        for (int i = num1; i < num1+3; i++) {  
            int l = 0;
            for (int j = num2; j < num2+3; j++) { 
                int k = 0;
                if (matrizGrande [i][j] != matrizPeque[l][k]){
                    return false;
                }
                k++;          
            }
            l++;
        }
        return true;
    }//metodoCompruebaSubMatriz
}//Class

