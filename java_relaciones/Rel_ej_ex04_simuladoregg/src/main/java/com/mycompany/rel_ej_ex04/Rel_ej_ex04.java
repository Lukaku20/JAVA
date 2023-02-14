/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rel_ej_ex04;

import Entidades.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import servicios.Simulador;

/**
 *
 * @author siduncuNotebook
 */
public class Rel_ej_ex04 {

    public static void main(String[] args) {
        boolean seguir = true;
        ArrayList<Alumno> lista = new ArrayList<>();
        
        while(seguir){
        Simulador eggsimulado = new Simulador();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("          ☺        ☺       ☺        ☺      ");
        System.out.println(" --------SIMULADOR DE NOMBRES ALEATORIOS----------;");
        System.out.println(" 1. generar nombres aleatorios.");
        System.out.println(" 2. mostrar la lista");
        System.out.println(" 3. ordenar por Dni´s");
        System.out.println(" 4. ordenar alfabeticamente");
        System.out.println(" 5. simulador de votos");
        System.out.println(" 6. salir.");
        System.out.println(" ------------------------------------;");
        System.out.println(" ");
        Integer leer = scan.nextInt();
        
        switch(leer){
            case 1: 
                   lista = eggsimulado.generarNombresAleatorios();       
            break;
            case 2: eggsimulado.mostrarLista(lista);
            break;
            case 3: eggsimulado.ordenarPorOrdenDni(lista);
            break;
            case 4: Collections.sort(lista);
                break;
            case 5: eggsimulado.simuladorDeVoto(lista);
                break;
            case 6: seguir = false;
            break;
            default: System.out.println("Elige de nuevo");
        }
        }
    }
    
}
