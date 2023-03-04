
package Entidades;

import Enum.EstadoCivil;
import java.time.LocalDate;

/**
 *
 * @author siduncuNotebook
 */
public final class Docente extends Empleado{
    
    protected String departamento;

    public Docente() {
    }

    public Docente(String departamento) {
        this.departamento = departamento;
    }

    public Docente(String departamento, LocalDate anoIngreso, Integer despacho) {
        super(anoIngreso, despacho);
        this.departamento = departamento;
    }

    public Docente(String departamento, LocalDate anoIngreso, Integer despacho, String nombreCompleto, EstadoCivil estadoCivil, Integer identificado) {
        super(anoIngreso, despacho, nombreCompleto, estadoCivil, identificado);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    @Override
    public String toString() {
        return "Profesor: " + super.nombreCompleto + " departamento: " + departamento + "\n"
                + super.toString();
    }
    
}
