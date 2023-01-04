/*

 */
package Service;

import Entida.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author lukaku20
 */
public class StudentService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Student studentNew(){
        Student stu = new Student();
        System.out.println("The name of student is: ");
        stu.setName(leer.nextLine());
        System.out.println("Whats grades does the student have? (Set three(3)notes)" );
        stu.setNotI(leer.nextInt());
        stu.setNotII(leer.nextInt());
        stu.setNotO(leer.nextInt());
    
        System.out.println("Complete, finish.");
        leer.nextLine();
        return stu;
        
    }
    public int calcularNotaFinal (Student stu){
        return Math.round((stu.getNotI()+stu.getNotII()+stu.getNotO())/3);
    }
    
    public void mostrarNotaFinal(HashMap <String , Integer> allStu){
        allStu.entrySet().forEach((entry) -> {
            System.out.println( entry.getKey()+" have a final note:" + entry.getValue());
        }); //Math.round((stu.getNotI()+stu.getNotII()+stu.getNotO())/3);
    }
    public void mostrarPizarra(ArrayList <Student> list){
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
        
        
    }
   
}
