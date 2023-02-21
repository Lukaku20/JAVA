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
public class Barco {
    
    private String matricula;
    private Integer eslora;
    private Integer anio;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
    public Integer calculoAlquiler(LocalDate alquiler, LocalDate devolucion){
        return (int)alquiler.compareTo(devolucion) * eslora*10;
    }
    
    
}
