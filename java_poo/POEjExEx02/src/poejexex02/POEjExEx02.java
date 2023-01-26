/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poejexex02;

import Entidad.Tiempo;
import Servicios.ServiceTiempo;
import java.util.Date;
import java.util.Scanner;

/**Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 *
 * @author lukaku20
 */
public class POEjExEx02 {

    /**Intentando crear un reloj.
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("La fecha y hora actual es: " + fecha.toString());
            
        ServiceTiempo serTiem = new ServiceTiempo();
        Tiempo tiempo = serTiem.crearTiempo();
        
        System.out.println(tiempo.toString());
        System.out.println("¿Desea iniciar el reloj? s/n");
        String a = leer.next();
        if(a.equalsIgnoreCase("s")){
            while(true){
                serTiem.iniciarHora(tiempo);
                System.out.println(tiempo.toString());
            }
        }
    }
    
}
