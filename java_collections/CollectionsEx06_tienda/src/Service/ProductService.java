
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
    
    public 
    void newPro (){
        
        do {
            Producto nuevo = new Producto();
            System.out.println("Coloca el nombre: ");
            nuevo.setName(leer.next());
            System.out.println("Ahora el precio: ");
            nuevo.setPrice(leer.nextDouble());
            System.out.println("Completo.");
            listOfProducts.put(nuevo.getName(), nuevo.getPrice());
            System.out.println("¿Desea seguir agregando productos si/no?");
//            String resp = leer.next();
//                System.out.println(" _____________________________________");
//            if (!resp.equalsIgnoreCase("s")) {
//            } else {
//                continua = true;
            
        } while (leer.next().equalsIgnoreCase("si"));
    }
    
    public void mostrar(){
        for (Map.Entry <String, Double> entry : listOfProducts.entrySet()) {
            System.out.println("Producto: "+ entry.getKey() + " precio: $"+ entry.getValue());
        }
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
                System.out.println("El precio nuevo de " + entry.getKey() + " , es $"+ entry.getValue());
            }
        }
        
    }
    
    public void eliminarPro(){
        System.out.println("¿Que producto elimina?");
        String cambia = leer.next();
        
        if (listOfProducts.containsKey(cambia)) {
            System.out.println("Se borra: " + cambia);
            listOfProducts.remove(cambia);
        } else {
            System.out.println("El producto no se encontró");
        }
    }
    
    
    public void cargarListaPrevia(){
        listOfProducts.put("Buzo", 3199.99);
        listOfProducts.put("Remera", 2699.99);
        listOfProducts.put("Camisa", 5299.99);    
        listOfProducts.put("Campera", 8499.99);
        listOfProducts.put("Gorra", 1699.99);
    }
    
    public void menuPrincipal(){
        boolean exit = false;
        while(!exit){
                
        System.out.println("            ______________________________");
        System.out.println("                                          ");
        System.out.println("            ***  *  ***  **  *  ***    *   ");
        System.out.println("             *   *  **   * * *  *  *  * *  ");
        System.out.println("             *   *  ***  *  **  ***  *   * " );
        System.out.println("            ______________________________");
            System.out.println("                                     ");
        System.out.println("        1. Agregar producto. ");
        System.out.println("         2. Modificar precio. ");
        System.out.println("        3. Eliminar producto.");
        System.out.println("         4. Ver lista completa.");
        System.out.println("        5. Cargar lista previa.");
        System.out.println("         6. Cerrar y salir.   ");
        Integer opcion = leer.nextInt();
        
        switch(opcion){
            case 1: newPro();
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
            default: System.out.println("Elige una opcion que sea válida.");
        }
        }
        
    }
}
