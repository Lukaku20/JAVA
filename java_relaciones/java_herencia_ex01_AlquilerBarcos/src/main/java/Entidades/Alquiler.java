/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author lukaku20
 */
public class Alquiler {
    
    private String name;
    private Long dni;
    private LocalDate alquiler;
    private LocalDate devolucion;
    private Integer posAmarre;
    private Barco ocupado;

    public Alquiler(Barco ocupado) {
        this.ocupado = ocupado;
    }

    public Alquiler(String name, Long dni, LocalDate alquiler, LocalDate devolucion, Integer posAmarre, Barco ocupado) {
        this.name = name;
        this.dni = dni;
        this.alquiler = alquiler;
        this.devolucion = devolucion;
        this.posAmarre = posAmarre;
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Alquiler ( " + name + " dni:" + dni + " desde: " + alquiler + " hasta: " + devolucion + "\n" +
                "posicion: " + posAmarre + " ocupado por: " + ocupado.getMatricula() + ')';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public LocalDate getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(LocalDate alquiler) {
        this.alquiler = alquiler;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }

    public Integer getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(Integer posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getOcupado() {
        return ocupado;
    }

    public void setOcupado(Barco ocupado) {
        this.ocupado = ocupado;
    }
    
}
