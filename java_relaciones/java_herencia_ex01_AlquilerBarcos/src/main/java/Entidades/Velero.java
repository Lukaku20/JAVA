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
public class Velero extends Barco {
    
    private Integer mastiles;

    public Velero(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(Integer mastiles, String matricula, Integer eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }

    public Velero() {
    }

    @Override
    public Integer calculoAlquiler(LocalDate alquiler, LocalDate devolucion) {
        long dias = ChronoUnit.DAYS.between(alquiler, devolucion);
        return (int) (dias * (super.getEslora() * 10 + mastiles));
    }
    
}
