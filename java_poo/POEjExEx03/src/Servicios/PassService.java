/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Pass;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class PassService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String crearPass(){
        String pasw;
        do{
           System.out.println("Ingresa una contraseña de 10 caracteres");
           pasw = leer.next();
        }while(10!=pasw.length());
        return pasw;
    }
    public void analizarPass(String pass){
        if (!pass.contains("z")) {
            System.out.println("Nivel BAJO.");
        } else {
            if (!pass.contains("a|a")) {
                System.out.println("Nivel MEDIO.");
            }
            else{
            System.out.println("Nivel ALTO.");
            }
         }
}
    public Pass modificarDatos(Pass pass){
        System.out.println("Ingresa su contraseña actual: ");
        String pasw = leer.next();
        if(pass.getPass().equals(pasw)){
            System.out.println("Para modificar nombre y dni, coloque nuevos: ");
            pass.setNombre(leer.next());
            pass.setDni(leer.nextInt());
        }else{
            System.out.println("La contraseña no es correcta.");
        }
        return pass;
    }
    public String modificarPass(String pass){
        System.out.println("Ingresa su contraseña actual: ");
        String pasw = leer.next();
        if(pass.equals(pasw)){
            System.out.println("Ingresa nueva contraseña: ");
            pasw = crearPass();
        }else{
            System.out.println("La contraseña no es correcta.");
        }
        return pasw;
    }
    public void mostrar(Pass pass){
        System.out.println(pass.toString());
    }
    public void menu(){
        boolean salir = false;
        Pass pass = new Pass("lukaku20","Lucas",33760279);
        do{
        System.out.println("Bienvenido al MENU:");
        System.out.println("A) Crear contraseña.");
        System.out.println("B) Analizar contraseña.");
        System.out.println("C) Modificar contraseña.");
        System.out.println("D) Modificar nombre y DNI");
        System.out.println("E) Salir.");
        System.out.println("F) Muestra los datos");
        String resp = leer.next().toUpperCase();
        switch (resp) {
            case "A":
                pass.setPass(crearPass());
                break;
            case "B":
                analizarPass(pass.getPass());
                break;
            case "C":
                pass.setPass(modificarPass(pass.getPass()));
                break;
            case "D":
                modificarDatos(pass);
                break;
            case "E":
                salir = true;
                break;
            case "F":
                mostrar(pass);
                break;
        }
        
    }while(salir==false);
}
}
