/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author lukaku20
 */
public class Cafetera {
    
    public int cantidadMax;
    public int cantidadActual;

    public Cafetera(int cantidadMax, int cantidadActual) {
        this.cantidadMax = cantidadMax;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
        
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
