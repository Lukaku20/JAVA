
package Entidades;

/**
 * @author lukaku20
 */
public class Camping extends AlojamientoExtraHotelero{
    

    private Integer carpas;
    private Integer banos;
    private Boolean resto;

    public Camping() {
    }

    public Camping(Integer carpas, Integer banos, Boolean resto) {
        this.carpas = carpas;
        this.banos = banos;
        this.resto = resto;
    }

    public Camping(Integer carpas, Integer banos, Boolean resto, Boolean privado, Integer metrosCuadros) {
        super(privado, metrosCuadros);
        this.carpas = carpas;
        this.banos = banos;
        this.resto = resto;
    }

    public Camping(Integer carpas, Integer banos, Boolean resto, Boolean privado, Integer metrosCuadros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadros, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banos = banos;
        this.resto = resto;
    }

    public Integer getCarpas() {
        return carpas;
    }

    public void setCarpas(Integer carpas) {
        this.carpas = carpas;
    }

    public Integer getBanos() {
        return banos;
    }

    public void setBanos(Integer banos) {
        this.banos = banos;
    }

    public Boolean getResto() {
        return resto;
    }

    public void setResto(Boolean resto) {
        this.resto = resto;
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

    @Override
    public String toString() {
        return "Camping{" + "carpas=" + carpas + ", banos=" + banos + ", resto=" + resto + '}';
    }

   
    
}
