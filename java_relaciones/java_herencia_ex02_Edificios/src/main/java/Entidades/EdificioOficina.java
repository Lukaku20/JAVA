
package Entidades;

/**
 * @author lukaku20
 */
public class EdificioOficina extends Edificio{
    
    private Integer nOficinas;
    private Integer ppOficina;
    private Integer nPisos;

    public EdificioOficina() {
    }

    public EdificioOficina(Integer nOficinas, Integer ppOficina, Integer nPisos) {
        this.nOficinas = nOficinas;
        this.ppOficina = ppOficina;
        this.nPisos = nPisos;
    }

    public EdificioOficina(Integer nOficinas, Integer ppOficina, Integer nPisos, Double ancho, Double largo, Double alto) {
        super(ancho, largo, alto);
        this.nOficinas = nOficinas;
        this.ppOficina = ppOficina;
        this.nPisos = nPisos;
    }

    public Integer getnOficinas() {
        return nOficinas;
    }

    public void setnOficinas(Integer nOficinas) {
        this.nOficinas = nOficinas;
    }

    public Integer getPpOficina() {
        return ppOficina;
    }

    public void setPpOficina(Integer ppOficina) {
        this.ppOficina = ppOficina;
    }

    public Integer getnPisos() {
        return nPisos;
    }

    public void setnPisos(Integer nPisos) {
        this.nPisos = nPisos;
    }

    @Override
    public Double calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public Double calcularVolumen() {
        return ancho*largo*alto;
    }
    
    public Integer cantidadPerson(){
        return nPisos*ppOficina*nOficinas;
    }
}
