
package Enum;

/**
 * @author lukaku20
 */
public enum EstadoCivil {
    
    SOLTERO("Soltero / a"),
    CASADO ("Casado / a"),
    DIVORCIADO("Divorciado /a"),
    VIUDO("Viudo / a"),
    UNIDO ("Unido legalmente / Unida legalmente"),;
    
    private String estado;

    private EstadoCivil() {
    }

    private EstadoCivil(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }    
}
