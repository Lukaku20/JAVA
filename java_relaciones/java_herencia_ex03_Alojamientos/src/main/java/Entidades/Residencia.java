
package Entidades;

/**
 * @author lukaku20
 */
public class Residencia extends AlojamientoExtraHotelero{
    

    private Integer habitaciones;
    private Boolean descuento;
    private Boolean deportivo;

    public Residencia() {
    }

    @Override
    public String toString() {
        return "Residencia{" + "habitaciones=" + habitaciones + ", descuento=" + descuento + ", deportivo=" + deportivo + '}';
    }

    public Residencia(Integer habitaciones, Boolean descuento, Boolean deportivo) {
        this.habitaciones = habitaciones;
        this.descuento = descuento;
        this.deportivo = deportivo;
    }

    public Residencia(Integer habitaciones, Boolean descuento, Boolean deportivo, Boolean privado, Integer metrosCuadros) {
        super(privado, metrosCuadros);
        this.habitaciones = habitaciones;
        this.descuento = descuento;
        this.deportivo = deportivo;
    }

    public Residencia(Integer habitaciones, Boolean descuento, Boolean deportivo, Boolean privado, Integer metrosCuadros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadros, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuento = descuento;
        this.deportivo = deportivo;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    public Boolean getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Boolean deportivo) {
        this.deportivo = deportivo;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getMetrosCuadros() {
        return metrosCuadros;
    }

    public void setMetrosCuadros(Integer metrosCuadros) {
        this.metrosCuadros = metrosCuadros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    
   
}
