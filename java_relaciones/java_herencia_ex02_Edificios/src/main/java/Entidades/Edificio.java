
package Entidades;

/**
 * @author lukaku20
 */
public abstract class Edificio {
    
    protected Double ancho;
    protected Double largo;
    protected Double alto;

    public Edificio() {
    }

    public Edificio(Double ancho, Double largo, Double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "ancho: " + ancho + " largo:" + largo + " alto: " + alto ;
    }
    
    public abstract Double calcularSuperficie();
    //    return ancho*largo;
    
    
    public abstract Double calcularVolumen();
    //    return ancho*largo*alto;
    
    //public abstract void crearEdificio();
}
