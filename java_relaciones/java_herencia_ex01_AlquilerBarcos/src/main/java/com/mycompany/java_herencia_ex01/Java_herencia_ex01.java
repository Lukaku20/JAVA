/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_herencia_ex01;

import Entidades.AMotor;
import Entidades.Alquiler;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lukaku20
 */
public class Java_herencia_ex01 {
    
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        ArrayList<Alquiler> alquileres = new ArrayList<>();
        int opcion;
        boolean exit = false;
        while(!exit){
        System.out.println(" ");
        System.out.println(" -----------------------------");
        System.out.println(" ---#  ALQUILER DE BARCOS #---");
        System.out.println(" -----------------------------");
        System.out.println(" ");
        System.out.println(" 1. Velero.");
        System.out.println(" 2. A motor.");
        System.out.println(" 3. Yate.");
        System.out.println(" 4. Salir.");
        System.out.println(" 5. Ver alquileres.");
        System.out.println(" _____________________________");
        System.out.println(" ");
        opcion=scan.nextInt();
        switch(opcion){
            case 1: Alquiler vela = new Alquiler(new Velero(3, "AMD365", 7, 1988));
                    completarAlquiler(vela);
                    alquileres.add(vela);
                    System.out.println("El alquiler tiene un costo de: $" + vela.getOcupado().calculoAlquiler(vela.getAlquiler(),vela.getDevolucion()));
                break;
            case 2: Alquiler moto = new Alquiler(new AMotor(8d, "CKS124", 9, 1994));
                    completarAlquiler(moto);
                    alquileres.add(moto);
                    System.out.println("El alquiler tiene un costo de: $" + moto.getOcupado().calculoAlquiler(moto.getAlquiler(),moto.getDevolucion()));
                break;
            case 3: Alquiler yate = new Alquiler(new Yate(3, 10d, "FGH589-D", 11, 1999));
                    completarAlquiler(yate);
                    alquileres.add(yate);
                    System.out.println("El alquiler tiene un costo de: $" + yate.getOcupado().calculoAlquiler(yate.getAlquiler(),yate.getDevolucion()));
                break;
            case 4: exit=true;
            break;
            case 5: for (Alquiler barco : alquileres) {
                System.out.println(" ----------------");
                System.out.println(barco);
                System.out.println(" ");
                }
                break;
        }
            System.out.println("Presiona ENTER para continuar.");
            scan.next();
        }
    }
    public static void completarAlquiler(Alquiler nuevo){
        System.out.println("Ingrese su nombre: ");
        nuevo.setName(scan.next());
        System.out.println("Ingrese su dni: ");
        nuevo.setDni(scan.nextLong());
        System.out.println("Ingrese el dia desde que comienza el alquiler: ");
        int dia = scan.nextInt();
        System.out.println("Mes: ");
        int mes = scan.nextInt();
        nuevo.setAlquiler(LocalDate.of(2023, mes, dia));
        System.out.println("Ingrese el dia que finaliza el alquiler: ");
        dia = scan.nextInt();
        System.out.println("Mes: ");
        mes = scan.nextInt();
        nuevo.setDevolucion(LocalDate.of(2023, mes, dia));
        nuevo.setPosAmarre((int) (Math.random() * 20));
        System.out.println("Llenado con exito.");
    }
}
