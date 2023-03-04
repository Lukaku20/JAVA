
package Entidades;

import Enum.EstadoCivil;
import java.time.LocalDate;

/**
 * @author lukaku20
 */
public final class NoDocente extends Empleado{
    
    protected String seccion;

    public NoDocente() {
    }

    public NoDocente(String seccion) {
        this.seccion = seccion;
    }

    public NoDocente(String seccion, LocalDate anoIngreso, Integer despacho) {
        super(anoIngreso, despacho);
        this.seccion = seccion;
    }

    public NoDocente(String seccion, LocalDate anoIngreso, Integer despacho, String nombreCompleto, EstadoCivil estadoCivil, Integer identificado) {
        super(anoIngreso, despacho, nombreCompleto, estadoCivil, identificado);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "No docente: " + super.nombreCompleto + " seccion: " + seccion + "\n"
                + super.toString();
    }
    
}
