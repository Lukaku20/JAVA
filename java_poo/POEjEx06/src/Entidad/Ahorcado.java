/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author usuario
 */
public class Ahorcado {
    
    private String [] palabraBuscar;
    private int cantidadEncontradas;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, int cantidadEncontradas, int intentos) {
        this.palabraBuscar = palabraBuscar;
        this.cantidadEncontradas = cantidadEncontradas;
        this.intentos = intentos;
    }

    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getCantidadEncontradas() {
        return cantidadEncontradas;
    }

    public void setCantidadEncontradas(int cantidadEncontradas) {
        this.cantidadEncontradas = cantidadEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    
}
