
package Entidades;

import Enum.EstadoCivil;
import java.time.LocalDate;

/**
 * @author lukaku20
 */
public class Empleado extends Persona{
    
    protected LocalDate anoIngreso;
    protected Integer despacho;

    public Empleado() {
    }

    public Empleado(LocalDate anoIngreso, Integer despacho) {
        this.anoIngreso = anoIngreso;
        this.despacho = despacho;
    }

    public Empleado(LocalDate anoIngreso, Integer despacho, String nombreCompleto, EstadoCivil estadoCivil, Integer identificado) {
        super(nombreCompleto, estadoCivil, identificado);
        this.anoIngreso = anoIngreso;
        this.despacho = despacho;
    }

    public LocalDate getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(LocalDate anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }
    
    public void cambioDespacho(Integer despacho){
        this.despacho = despacho;
        System.out.println("Su nuevo despacho es: " + despacho);
    }

    @Override
    public String toString() {
        return "Año Ingreso: " + anoIngreso + " Despacho: " + despacho + "\n"
                + super.toString();
    }
    
}
