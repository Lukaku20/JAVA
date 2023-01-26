/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Tiempo;

import java.util.Scanner;



/**
 *
 * @author lukaku20
 */
public class ServiceTiempo {
    Scanner leer = new Scanner(System.in);
    public Tiempo crearTiempo(){
        int hs, min, seg;
        Tiempo hora = new Tiempo();
        System.out.println("Coloca la hora en que desea iniciar el 'R E L O J' ");
        hora.setHs(hora());
        hora.setMin(minYSeg());
        hora.setSeg(minYSeg());
        return hora;
        
    }
    
    public int hora(){
    int hs;
        do{
    System.out.println("Ingresa la hora:");
    hs = leer.nextInt();
    }while(hs<0 || hs>24);
    return hs;
    }
    public int minYSeg(){
        int num;
        do{
            System.out.println("Ingresa dato:");
            num = leer.nextInt();
        }while (num<0 || num>59);
        return num;
    }
    
    public void iniciarHora(Tiempo tiempo) throws InterruptedException{
       tiempo.setSeg(tiempo.getSeg()+1);
       if (tiempo.getSeg()== 60){
           tiempo.setSeg(0);
           tiempo.setMin(tiempo.getMin()+1);
           if(tiempo.getMin()== 60){
               tiempo.setMin(0);
               tiempo.setHs(tiempo.getHs()+1);
               if (tiempo.getHs()== 24){
                   tiempo.setHs(0);
               }
                       
           }
       }
       Thread.sleep(1000);     
    }
}



