/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entida.Fecha;
import java.util.Scanner;

/*        
//**      /\
/**      //\\
 *   ªªª///\\\ªªª
 * @author lukaku20
 */
public class ServiceFecha {
 
    Scanner leer = new Scanner(System.in);
    public Fecha colocarFecha(){
    Fecha f1 = new Fecha();
        System.out.println("Ingresa Fecha, Día .. Mes .. Año .");
        f1.setDia(leer.nextInt());
        f1.setMes(leer.nextInt());
        f1.setAño(leer.nextInt());
        return f1;
        
    
}
    public boolean verificarAnio(Fecha f1){
        int valido = f1.getAño();
        return (valido >= 1900 && valido <= 2022);
    }
    
    public int cantidadDias(Fecha f1){
        int mes = f1.getMes();
        int res = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return res = 31;
            case 2:
                return res = 28;
            default:
                return res = 30;
        }
    }
    public String pasarMes(Fecha f1){
        String [] meses = new String [12];
        int num = f1.getMes()-1;
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";
        return meses[num];
                
    }
    public boolean determinarBisiesto(Fecha f1){
            int anio = f1.getAño();
            boolean verdadero = false;
            if (anio%4==0){
                if (anio%100==0){
                    if (anio%400==0){
                       verdadero = true; 
                    }
                }else{
                    verdadero = true;
                }
            }
            return verdadero;
}
}

