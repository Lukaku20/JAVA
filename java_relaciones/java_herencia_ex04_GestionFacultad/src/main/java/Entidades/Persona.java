
package Entidades;

import Enum.EstadoCivil;

/**
 * @author lukaku20
 */
public class Persona {
    
    protected String nombreCompleto;
    protected EstadoCivil estadoCivil;
    protected Integer identificado;

    public Persona() {
    }

    public Persona(String nombreCompleto, EstadoCivil estadoCivil, Integer identificado) {
        this.nombreCompleto = nombreCompleto;
        this.estadoCivil = estadoCivil;
        this.identificado = identificado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getIdentificado() {
        return identificado;
    }

    public void setIdentificado(Integer identificado) {
        this.identificado = identificado;
    }
    
    public void cambioEstado(EstadoCivil estadoCivil){
        this.estadoCivil = estadoCivil;
        System.out.println("Ha cambiado estado civil a: " + estadoCivil);
    }

    @Override
    public String toString() {
        return " Estado civil:" + estadoCivil + " Identificado: " + identificado;
    }
    
}
