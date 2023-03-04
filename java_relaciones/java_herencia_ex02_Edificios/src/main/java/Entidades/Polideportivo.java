
package Entidades;

/**
 *
 * @author lukaku20
 */
public class Polideportivo extends Edificio{
    
    private String nombre;
    private boolean abierto;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean abierto) {
        this.nombre = nombre;
        this.abierto = abierto;
    }

    public Polideportivo(String nombre, boolean abierto, Double ancho, Double largo, Double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.abierto = abierto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }
    

    @Override
    public Double calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public Double calcularVolumen() {
        return ancho*largo*alto;
    }
    
}
