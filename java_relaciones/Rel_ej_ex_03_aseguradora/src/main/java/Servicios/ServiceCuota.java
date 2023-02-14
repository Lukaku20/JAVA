/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cuota;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author siduncuNotebook
 */
public class ServiceCuota {
    
    private Scanner scan;
    private TreeSet<Cuota> plan;

    public ServiceCuota() {
        scan = new Scanner(System.in).useDelimiter("\n");
        plan = new TreeSet<Cuota>();
    }
    
    public Float calcularMonto(){
        Float monto=0f;
        System.out.println("1. Plan A");
        System.out.println("2. Plan B");
        System.out.println("3. Plan C");
        int g = scan.nextInt();
        switch(g){
            case 1: monto = 110.6f; 
                break;
            case 2: monto = 64.2f;
                break;
            case 3:monto = 49.5f;
                break;
            default: System.out.println("Hazlo de nuevo");
        }
        return monto;
    }
    
    public void menuCuota(){
        boolean salir=false;
        while(!salir){
        System.out.println("--------------PLAN------------");
        System.out.println("1. crear plan");
        System.out.println("2. mostrar plan");
        System.out.println("3. salir");
        int k  = scan.nextInt();
        switch(k){
            case 1: crearPlan(calcularMonto());
            break;
            case 2: mostrarPlan();
            break;
            case 3: salir = true;
            break;
        }
        }
        
    }
    public TreeSet<Cuota> crearPlan(Float monto){
        System.out.println("¡De cuantas cuotas quiere su plan!?");
        int cuotas = scan.nextInt();
        Cuota[] pla = new Cuota[cuotas];
        for (int i = 0; i < cuotas; i++) {
            pla[i] = new Cuota();
            pla[i].setNumero(i+1);
            pla[i].setMonto(monto/cuotas);
            plan.add(pla[i]);            
        }
        return plan;
    }
    public void mostrarPlan(){
        for (Cuota cuota : plan) {
            System.out.println(cuota.toString());
        }

    }
}
