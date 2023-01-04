
package Servicios;

import Entida.Sopa;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class SopaService {
public int contar;

    public void iniciarMatriz(Sopa soup) {
        String[][] sopa = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sopa[i][j] = "*";
            }
        }
        soup.setMatrix(sopa);
    }

    public void mostrarSoup(Sopa soup) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + soup.getMatrix()[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void iniciarPalabrasaBuscar(Sopa soup) {

        String[][] matrix = new String[10][10];
        //copiar la matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = soup.getMatrix()[i][j];
            }
        }
        System.out.println(" ");

        //palabras a grabar.
        String[] palabras = new String[]{"presa", "dulce", "rezar", "mirar", "cielo"};
        //revisar si hay espacio disponible.
        for (int p = 0; p < 5; p++) {

            boolean ocupado = false;
            boolean ubicada = false;

            int o = 0;
            int f = 0;

            do {
                int l = (int) (Math.random() * 9);
                int k = (int) (Math.random() * 5);

                if (matrix[l][k].equals("*")) {

                    for (int j = k; j < k + 5; j++) {

                        if (!matrix[l][j].equals("*")) {
                            ocupado = true;
                            break;
                        } 
                    }
                    if (!ocupado) {
                        for (int j = k; j < k + 5; j++) {
                            matrix[l][j] = (palabras[p].substring(o, o + 1));
                            o++;
                        }

                        
                        f++;
                    }
                } else {
                    break;
                }
                if (f == 1) {
                    ubicada = true;
                }
            } while (ubicada = false);
        }
        soup.setMatrix(matrix);
    }

    public void completarConLetras(Sopa soup) {
        String[] letras = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[][] matrix = new String[10][10];
        //copiar la matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //reemplazar por: System.arraycopy(soup.getMatrix()[i], 0, matrix[i], 0, 10);
                matrix[i][j] = soup.getMatrix()[i][j];
            }
        }
        //variable auxiliar random.

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (soup.getMatrix()[i][j].equals("*")) {
                    int x = (int) (Math.random() * 27);
                    matrix[i][j] = letras[x];
                }

            }

        }
        soup.setMatrix(matrix);
    }

    public void intentarAdivinar(Sopa soup, int intento) {
        Scanner leer = new Scanner(System.in);
        contar = 0;
        String[] encontradas = new String[5];
        //copiar las palabras encontradas al arreglo.
//            encontradas = soup.getPalabrasEncontradas().clone();
        System.out.println("Introduce la palabra vista: ");
        String palabra = leer.nextLine();
        soup.setPalabraEncontrar(palabra);
        //convertir palabra a vector.
        String[] palabraV = new String[5];
        int lon = palabra.length();
        for (int i = 0; i < lon; i++) {
            palabraV[i] = palabra.substring(i, i + 1);
        }
        //comprobar si esta la palabra
        boolean prueba = false;
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                contador=0;
                if (soup.getMatrix()[i][j].equals(palabraV[0])) {
                    for (int k = 0; k < 5; k++) {
                        if (soup.getMatrix()[i][j+k].equals(palabraV[k])) {
                          
                            prueba = true;
                            contador++;
                        } else {
                            break;
                        }
                        
                    }
                }
                if (contador==5) {
                    break;
                }
            }
            if (contador==5) {
                    break;
                }
        }
        if (contador==5) {
            soup.getPalabrasEncontradas()[intento] = palabra;
            

            System.out.println("Acertaste");
            contar++;
        } else {
            System.out.println("No es esa.");
            contar--;
        }
        System.out.println(soup.toString());

    
}
    public void evaluar(Sopa a){
        int segun = 5 - contar;
        
        if(contar==5){
                System.out.println("Perfecto! Ganaste el juego!!!");
        }
         else {
            System.out.println("No lo lograste, te faltaron: " + segun);
        }
        
}
    public boolean jugarDeNuevo(){
        Scanner leer = new Scanner(System.in);
        boolean dicho = false;
        System.out.println("¿Quieres jugar de nuevo. s/n?");
        String respuesta = leer.nextLine().toLowerCase();
        if(respuesta.equalsIgnoreCase("s")){
            dicho=true;
        }
        return dicho;
    }

    }
//          prueba imprimir el vector.
//            for (int i = 0; i < lon; i++) {
//                System.out.print(" "+palabraV[i]+" ");
//                
//            }
//            System.out.println(" ");
//        }
