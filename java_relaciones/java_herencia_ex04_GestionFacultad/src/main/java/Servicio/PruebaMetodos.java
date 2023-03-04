
package Servicio;

import Entidades.Docente;
import Entidades.Estudiante;
import Entidades.NoDocente;
import Entidades.Persona;
import static Enum.EstadoCivil.CASADO;
import static Enum.EstadoCivil.SOLTERO;
import static Enum.EstadoCivil.VIUDO;
import java.util.Set;
import static com.mycompany.java_herencia_ex04.Java_herencia_ex04.scan;
import java.time.LocalDate;
import java.util.HashSet;

/**
 * @author lukaku20
 */
public class PruebaMetodos {
    Set<Persona> conjuntoUniversal;
    GestionService callService;
    public PruebaMetodos() {
        conjuntoUniversal = new HashSet<>();
        callService = new GestionService();
    }
    
    public void crearConjunto(){
        Docente a = new Docente("Historia Mundial Contemporanea", LocalDate.MIN, Integer.SIZE, "Miguel Angel Firpo", CASADO, 1605);
        NoDocente b = new NoDocente("Academica", LocalDate.MIN, Integer.SIZE, "Julia Verne", SOLTERO,32120);
        Estudiante c = new Estudiante("Problematica historica", "Lionel Pacheco", VIUDO, 1001);
        conjuntoUniversal.add(c);conjuntoUniversal.add(b);conjuntoUniversal.add(a);
    }
    
    public void completarDatos(){
        
        System.out.println("1. Estudiante");
        System.out.println("2. Docente");
        System.out.println("3. No docente");
        int opcion = scan.nextInt();
        switch(opcion){
            case 1: for (Persona persona : conjuntoUniversal) {
                if(persona instanceof Estudiante){
                    callService.matricularEstudiante((Estudiante)persona);
                }        
            }break;
            case 2: for (Persona persona : conjuntoUniversal) {
                if(persona instanceof Docente){
                    callService.cambioDespacho((Docente) persona);
                }
            }break;
            case 3: for (Persona persona : conjuntoUniversal) {
                    if(persona instanceof NoDocente){
                    callService.cambioDespacho((NoDocente) persona);
                    callService.nuevaSeccion((NoDocente) persona);
                }
                }break;
                
    }
    }
    public void verListado(){
        for (Persona persona : conjuntoUniversal) {
            System.out.println(" ");
            System.out.println(persona.toString());
            
        }
    }
    public void modificarDatos(){
        System.out.println("Modifica el estado civil: ");
        for (Persona persona : conjuntoUniversal) {
            callService.cambioEstadoCivil(persona);
        }
    }
    
    public void menu(){
        crearConjunto();
        boolean salir = false;
        while(!salir){
            System.out.println("-----MENU DE GESTION UNIVERSIDAD-----");
            System.out.println("1. Completar datos.");
            System.out.println("2. Modificar datos.");
            System.out.println("3. Ver listado.");
            System.out.println("4. Salir");
            int opcion = scan.nextInt();
            switch(opcion){
                case 1: completarDatos();
                break;
                case 2: modificarDatos();
                    break;
                case 3: verListado();
                    break;
                case 4: salir = true;
                break;
                default: System.out.println("Esa opcion no es válida.");
            }
        }
    }
    
    
}
