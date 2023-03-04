
package Entidades;

import Enum.EstadoCivil;

/**
 *
 * @author lukaku20
 */
public class Estudiante extends Persona{
    
    protected String curso;

    public Estudiante() {
    }
    
    public Estudiante(String curso) {
        this.curso = curso;
    }

    public Estudiante(String curso, String nombreCompleto, EstadoCivil estadoCivil, Integer identificado) {
        super(nombreCompleto, estadoCivil, identificado);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante: " + super.getNombreCompleto() + " curso: " + curso + "\n"
                + super.toString();
    }
    
}
