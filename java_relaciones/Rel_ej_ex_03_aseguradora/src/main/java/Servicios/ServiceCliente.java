/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author siduncuNotebook
 */
public class ServiceCliente {
    private Scanner scan;
    private ArrayList<Cliente> clientes;
    private ServiceVehiculo servVehiculo;

    public ServiceCliente() {
        scan = new Scanner(System.in).useDelimiter("\n");
        clientes = new ArrayList<Cliente>();
        servVehiculo = new ServiceVehiculo();
    }
    
    
    
    public Cliente crearCliente(){
        System.out.println("Ingrese el nombre:");
        String nombre = scan.next();
        System.out.println("Ingrese el apellido:");
        String apellido = scan.next();
        System.out.println("Ingrese el dni:");
        String dni = scan.next();
        System.out.println("Ingrese el mail:");
        String mail = scan.next();
        System.out.println("Ingrese el telefono:");
        String telefono = scan.next();
        System.out.println("Ingrese el domicilio:");
        String domicilio  = scan.next();
        Vehiculo vehiculo = servVehiculo.crearVehiculo();
        clientes.add(new Cliente(nombre, apellido, dni, domicilio, telefono, mail, vehiculo));
        return new Cliente(nombre, apellido, dni, domicilio, telefono, mail, vehiculo);
    }
    
    public void modificarCliente(){
        Cliente cliente = buscarCliente();
        if(cliente==null){
            System.out.println("Ese cliente no existe aun.");
        } else{
            //modificar el cliente en cuestion.
        }
    }
    public void eliminarCliente(){
        Cliente cliente = buscarCliente();
        if(cliente==null){
            System.out.println("Ese cliente no existe aun.");
        } else{
            //eliminar el cliente en cuestion.
            clientes.remove(cliente);
        }
    }
    public Cliente buscarCliente(){
        System.out.println("Ingrese el DNI del cliente que desea seleccionar:");
        String buscar = scan.next();
        for (Cliente cliente : clientes) {
            if(buscar.equals(cliente.getDni())){
                return cliente;
            }
            
        }
        return null;
    }
    public void mostrarCliente(){
        Cliente cliente = buscarCliente();
        if(cliente==null){
            System.out.println("Ese cliente no existe aun.");
        } else{
            
            System.out.println(cliente.toString());
    }
            
    }
    public void menuCliente(){
        boolean salir = false;
        while(!salir){
            System.out.println("-------MENU DE CLIENTES-------");
            System.out.println("1. crear cliente");
            System.out.println("2. modificar cliente");
            System.out.println("3. eliminar cliente");
            System.out.println("4. mostrar cliente");
            System.out.println("5. salir");
            System.out.println(" ");
            int si=scan.nextInt();
            switch(si){
                case 1: crearCliente();
                break;
                case 2: modificarCliente();
                break;
                case 3: eliminarCliente();
                break;
                case 4: mostrarCliente();
                break;
                case 5: salir = true;
                break;
                default: System.out.println("Intenta de nuevo");
            }
        }
    }
}   
        
    