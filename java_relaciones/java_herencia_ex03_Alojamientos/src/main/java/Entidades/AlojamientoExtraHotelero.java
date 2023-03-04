
package Entidades;

/**
 * @author lukaku20
 */
public class AlojamientoExtraHotelero extends Alojamiento{
    
    protected Boolean privado;
    protected Integer metrosCuadros;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(Boolean privado, Integer metrosCuadros) {
        this.privado = privado;
        this.metrosCuadros = metrosCuadros;
    }

    public AlojamientoExtraHotelero(Boolean privado, Integer metrosCuadros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadros = metrosCuadros;
    }
    
    
    @Override
    public void precioPorHabitacion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "AlojamientoExtraHotelero{" + "privado=" + privado + ", metrosCuadros=" + metrosCuadros + '}';
    }
    
}
