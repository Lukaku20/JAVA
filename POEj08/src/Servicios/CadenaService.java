/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class CadenaService {
    public static int lon;
    public static String fra;
    public static Scanner leer = new Scanner(System.in);
    public void mostrarVocales(Cadena cadena){
        lon = cadena.getLongitud();
        fra = cadena.getFrase().toLowerCase();
        int vocal=0;
        for (int i = 0; i < lon; i++) {
            if(fra.substring(i, i+1).equals("a") || fra.substring(i, i+1).equals("e")|| fra.substring(i, i+1).equals("i") ||fra.substring(i, i+1).equals("o")||fra.substring(i, i+1).equals("u")){
                vocal++;
                System.out.print(fra.substring(i, i+1));
            }else{
                System.out.print(" ");
            }
            
        }
        System.out.println(" ");
        System.out.println("La cantidad de vocales es: "+ vocal);
    }
    public void invertirFrase(Cadena cadena){
        lon = cadena.getLongitud();
        fra = cadena.getFrase().toLowerCase();
        for (int i = lon-1; i < lon ; i--) {
            if (i<0){
                break;
            }else{
                System.out.print(fra.substring(i,i+1));
            }            
        }
        System.out.println(" ");
    }
    public void vecesRepetido(String letra, Cadena cadena){
        lon = cadena.getLongitud();
        fra = cadena.getFrase();
        int let=0;
        for (int i = 0; i < lon; i++) {
            if (!letra.equals(fra.substring(i, i+1))) {
            } else {
                let++;
            }
        }
        System.out.println("La letra: "+ letra+", se repite: "+let+" veces.");
    }
    public void unirFrase(String frase, Cadena cadena){
        fra = cadena.getFrase();
        cadena.setFrase(fra.concat(frase));
    }
    public String reemplazar(Cadena cadena){
        fra = cadena.getFrase();
        System.out.println("Todas las letras a se reemplazan por el simbolo que elijas: ");
        String symbol = leer.next();
        return fra.replace("a", symbol);
    }
    public boolean contiene(String let, Cadena cadena){
        return cadena.getFrase().contains(let);
    }
            
}
