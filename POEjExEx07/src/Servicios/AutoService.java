/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entida.Auto;
//import java.util.Date;
import java.util.Scanner;

/**
 *
     * @author lukaku20
 */
public class AutoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Auto crearFicha(){
        Auto nuevo = new Auto();
        System.out.println("Ingresa nombre y apellido"); 
        nuevo.setDueño(leer.nextLine());
        
        System.out.println("Dime el vencimiento del carnet: "
                + "\n" + "A\00ño:");
        int year = leer.nextInt();
        System.out.println("Mes:");
        int mon = leer.nextInt();
        System.out.println("Dia:");
        int day = leer.nextInt();
        String date = "Dia "+day+" del mes "+mon+" año: "+year+".";
        nuevo.setVencimiento(date);
        System.out.println("Modelo:");
        nuevo.setModelo(leer.nextInt());
        System.out.println("Kilometros:");
        nuevo.setKilo(leer.nextInt());
        System.out.println("Color:");
        nuevo.setColor(leer.next());
        return nuevo;
    }

    public void crearMenu(Auto a){
        
        System.out.println(" ");
        System.out.println("MENÚ DE USUARIO ");
        System.out.println("________________:"+"\n");
        System.out.println("1. Cambiar titularidad.");
        System.out.println("2. Ingresar ruta.");
        System.out.println("3. Calcular revision.");
        System.out.println("\n");
        int respuesta = leer.nextInt();
        
        switch (respuesta) {
                case 1:
                    leer.nextLine();//consume el '\n' salto de linea
                    a.setDueño(leer.nextLine());
                    break;
                case 2:
                    int ruta = leer.nextInt();
                    a.setKilo(a.getKilo() + ruta);
                    break;
                case 3:
                    int revision = 15000;
                    int diferencia = a.getKilo() - revision ;
                    if (a.getKilo() > revision) {
                        System.out.println("Necesita revision.");
                        
                        System.out.println("desde hace:" + diferencia + " km.");
                    } else{
                        System.out.println("No aun no necesita, restan : "+diferencia+" km.");
                    }
                    break;

            }
            System.out.println(a.toString());
        
    }
    }
    


