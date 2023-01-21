
package Service;

import Entida.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lukaku20
 */
public class ProductService {
    
    private HashMap<String, Double> listOfProducts;
    private Scanner leer;

    public ProductService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listOfProducts = new HashMap();
    }
    
    public Producto newPro (){
        Producto nuevo = new Producto();
        System.out.println("Coloca el nombre: ");
        nuevo.setName(leer.next());
        System.out.println("Ahora el precio: ");
        nuevo.setPrice(leer.nextDouble());
        System.out.println("Completo.");
        return nuevo;
    }
    public void mostrar(){
        for (Map.Entry <String, Double> entry : listOfProducts.entrySet()) {
            System.out.println("Producto: "+ entry.getKey() + ", precio: $"+ entry.getValue());
        }
    }
    public void agregar (Producto nuevo){
        listOfProducts.put(nuevo.getName(), nuevo.getPrice());
        
    }
    
    public void modificarPrecio(){
        Double precioNuevo;
        System.out.println("¿Que producto cambia de precio?");
        String cambia = leer.next();
        for (Map.Entry <String, Double> entry : listOfProducts.entrySet()) {
            if (cambia.equalsIgnoreCase(entry.getKey())){
                System.out.println("Cual es el nuevo precio: ");
                precioNuevo = leer.nextDouble();
                entry.setValue(precioNuevo);
                System.out.println("Producto: " + entry.getKey() + " , precio: $"+ entry.getValue());
            }
        }
        
    }
    
    public void eliminarPro(){
        System.out.println("¿Que producto elimina?");
        String cambia = leer.next();
        for (Map.Entry <String, Double> entry : listOfProducts.entrySet()) {
            if (cambia.equalsIgnoreCase(entry.getKey())){
                System.out.println("Se borra: "+ entry.getKey());
                listOfProducts.remove(entry.getKey());
            }
    }
    }
    public void cargarListaPrevia(){
        agregar(new Producto("Buzo", 3199.99));
        agregar(new Producto("Remera", 2699.99));
        agregar(new Producto("Camisa", 5299.99));
        agregar(new Producto("Campera", 8499.99));
        agregar(new Producto("Gorra", 1699.99));
    }
    
    public void menuPrincipal(){
        boolean exit = false;
        while(!exit){
                
        System.out.println(" ******************** ");
        System.out.println(" * MENU DE PRODUCTOS* ");
        System.out.println(" ******************** ");
        System.out.println(" 1. Agregar producto. ");
        System.out.println(" 2. Modificar precio. ");
        System.out.println(" 3. Eliminar producto.");
        System.out.println(" 4. Ver lista completa.");
        System.out.println(" 5. Cargar lista previa.");
        System.out.println(" 6. Cerrar y salir.   ");
        Integer opcion = leer.nextInt();
        switch(opcion){
            case 1: agregar(newPro());
            break;
            case 2: modificarPrecio();
            break;
            case 3: eliminarPro();
            break;
            case 4: mostrar();
            break;
            case 5: cargarListaPrevia();
            break;
            case 6: exit = true;
            break;
            default: System.out.println("Elige una opcion válida.");
        }
        }
        
    }
}
