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
public class Yate extends AMotor {
    
    private Integer camarotes;

    public Yate() {
    }

    public Yate(Integer camarotes) {
        this.camarotes = camarotes;
    }

    public Yate(Integer camarotes, Double potencia) {
        super(potencia);
        this.camarotes = camarotes;
    }

    public Yate(Integer camarotes, Double potencia, String matricula, Integer eslora, Integer anio) {
        super(potencia, matricula, eslora, anio);
        this.camarotes = camarotes;
    }

    @Override
    public Integer calculoAlquiler(LocalDate alquiler, LocalDate devolucion) {
        long dias = ChronoUnit.DAYS.between(alquiler, devolucion);
        return (int) (dias * (super.getEslora()) * 10 + (int)Math.round(super.getPotencia()) + camarotes);
    }
 
}
