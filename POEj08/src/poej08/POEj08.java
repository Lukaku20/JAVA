/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poej08;

import Entidad.Cadena;
import Servicios.CadenaService;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class POEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena cadena = new Cadena();
        CadenaService caden = new CadenaService();
        System.out.println("Ingresa una frase o palabras separadas: ");
        cadena.setFrase(leer.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        
        caden.mostrarVocales(cadena);
        caden.invertirFrase(cadena);
        
        System.out.println("¿Cuál letra deseas saber si se repite?");
        String letra = leer.next();
        caden.vecesRepetido(letra, cadena);
        System.out.println("Deseas unir una nueva frase a la anterior. s/n");
        String resp=leer.next();
        if(resp.equalsIgnoreCase("s")){
            System.out.println("Ingresa la frase: ");
            String frase = leer.next();
            caden.unirFrase(frase, cadena);
        }
        System.out.println("Invoca al metodo reemplazar: " + caden.reemplazar(cadena));
        System.out.println("Ingresa la letra que crea saber si la contiene: ");
        String let = leer.next();
        if(caden.contiene(let, cadena)){
            System.out.println("Si la contiene.");
        }else{
            System.out.println("No la contiene.");
        }
        
    }
    
}
