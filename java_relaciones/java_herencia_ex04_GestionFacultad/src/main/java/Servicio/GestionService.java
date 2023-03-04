
package Servicio;

import Entidades.Docente;
import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.NoDocente;
import Entidades.Persona;
import Enum.EstadoCivil;
import static com.mycompany.java_herencia_ex04.Java_herencia_ex04.scan;

/**
 * @author lukaku20
 */
public class GestionService {
 
    public void cambioEstadoCivil(Persona a){
        System.out.println("Modifica a: "+ a.getNombreCompleto());
        System.out.println("Ingrese el nuevo estado civil (SOLTERO CASADO DIVORCIADO VIUDO UNIDO) ");
        boolean valido = false;
        while(!false){
        String nuevo = scan.next().toUpperCase();
        for (EstadoCivil aux : EstadoCivil.values()) {
        if(aux.name().equalsIgnoreCase(nuevo)){
            a.cambioEstado(aux);
            valido = true;
            break;
            } 
        }break;
        }
    }
    
    public void cambioDespacho(Empleado b){
       
        System.out.println("Cual es el nuevo despacho de: " + b.getNombreCompleto());
        
            while (!scan.hasNextInt()) {
            System.out.println("el numero es incorrecto, ingreselo nuevamente");
            scan.next();  // Limpia la entrada del usuario
            }
            Integer nuevo = scan.nextInt();
            b.setDespacho(nuevo);
            System.out.println("El número ingresado es: " + nuevo);
    }
    
    public void matricularEstudiante(Estudiante c){
        System.out.println("A que curso desea incorporar al estudiante: " + c.getNombreCompleto());
        String nuevo = scan.next().toUpperCase();
        c.setCurso(c.getCurso()+" "+ nuevo);
        System.out.println("Se ha agregado con exito a: " + nuevo);
        
    }
    
    public void cambioDepartamento(Docente d){
        System.out.println("A que departamento desea asignar al docente: " + d.getNombreCompleto());
        String nuevo = scan.next().toUpperCase();
        System.out.println("El nuevo departamento asignado es: " + nuevo);
        d.setDepartamento(nuevo);
    }
    
    public void nuevaSeccion(NoDocente e){
        System.out.println("A que nueva seccion asigna a personal: " + e.getNombreCompleto());
        String nuevo = scan.next().toUpperCase();
        System.out.println("El nuevo departamento asignado es: " + nuevo);
        e.setSeccion(nuevo);
    }
    
}
