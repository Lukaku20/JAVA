/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author siduncuNotebook
 */
public class ServiceVehiculo {
    ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public Vehiculo crearVehiculo(){
        System.out.println("Cual es la marca del vehículo: ");
        String marca=scan.next();
        System.out.println("Cual es el modelo del vehículo: ");
        String modelo=scan.next();
        System.out.println("Cual es el color del vehículo: ");
        String color=scan.next();
        System.out.println("Cual es la ID del motor: ");
        String motor=scan.next();
        System.out.println("Cual es el numero de chasis: ");
        String chasis=scan.next();
        System.out.println("Cual es el tipo de vehículo: ");
        String tipo=scan.next();
        vehiculos.add(new Vehiculo(marca,modelo,color,motor,chasis,tipo));
        return new Vehiculo(marca,modelo,color,motor,chasis,tipo);
        
    
    }
    public Vehiculo buscarVehiculo() {
        System.out.println("Ingrese el numero de motor del vehiculo que desea seleccionar:");
        String buscar = scan.next();
        for (Vehiculo vehiculo : vehiculos) {
            if (buscar.equals(vehiculo.getMotor())) {
                return vehiculo;
            }

        }
        return null;
    }
    
    public void mostrarVehiculo(){
        Vehiculo vehiculo = buscarVehiculo();
        if(vehiculo==null){
            System.out.println("Ese cliente no existe aun.");
        } else{
            
            System.out.println(vehiculo.toString());
    }
            
    }
}

