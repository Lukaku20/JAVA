/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author lukaku20
 */
public class AMotor extends Barco{
    
    private Double potencia;

    public AMotor() {
    }

    public AMotor(Double potencia) {
        this.potencia = potencia;
    }

    public AMotor(Double potencia, String matricula, Integer eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    @Override
    public Integer calculoAlquiler(LocalDate alquiler, LocalDate devolucion) {
        long dias = ChronoUnit.DAYS.between(alquiler, devolucion);
        return (int) (dias * (super.getEslora())) * 10 + ((int)Math.round(potencia));
    }
    
    
}
