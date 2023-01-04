/*

 */
package collectionsex03;

import Entida.Student;
import Service.StudentService;
import java.util.HashMap;
import java.util.Scanner;

/**
 * * @author lukaku20
 */
public class CollectionsEx03 {

    /**
     */
    public static void main(String[] args) {
    
        StudentService callService = new StudentService();
        Scanner leer = new Scanner(System.in);
        boolean exit = false;
        HashMap<String, Integer> allStu = new HashMap();
           //responder por SI o NO.
        System.out.println("Answer yes or no.");
        while(!exit){

            //invita crear nuevo participante.
        System.out.println(" ");
        System.out.println("You want to create a new student?");
        String read = leer.nextLine();
            //si responde que sI.
        if(read.equals("yes")){
            //Tiene error se salta in Input(Scanner).nextLine()(Funciona con useDelimiter(\n)
            Student stu = callService.studentNew();
            //calcular la nota final.
            stu.setNotEnd(callService.calcularNotaFinal(stu));
            //agregar al stu a la Lista:
            allStu.put(stu.getName(), stu.getNotEnd());
            //Else Sino quiere seguir creando, Salir.
        } 
        
        else {
            //Pregunta si desea colocar notas finales.
           {     
            System.out.println("If you want to place the final grade, say yes...");
            read = leer.nextLine();
            //Ver la lista de Estdiantes.
            if(read.equals("yes")){
                System.out.println("You want to see the final note of the students?");
                read = leer.nextLine();
                if (read.equals("yes")) {
                    //escribir el programa mostrarLista() 
                    callService.mostrarNotaFinal(allStu);
                        
            }
                 
            //Crear opcion luego de salir de Seguir creando, 
       
            }
            //Pregunta si desea salir.
               if (!read.equals("yes")) {
                   System.out.println("You want to exit?");
                   read = leer.nextLine();
                   if (read.equals("yes")) {
                       exit = true;
                   }
       } 
        
        //Salir del programa.
        if(exit){
            break;
        } 
       
        
            
        }
        }
        
    
}
}
}