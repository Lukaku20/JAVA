
package Entidades;

/**
 * @author lukaku20
 */
public class Hotel5 extends Hotel4 {
    
    private Integer salones;
    private Integer suites;
    private Integer limusin;

    public Hotel5() {
    }

    public Hotel5(Integer salones, Integer suites, Integer limusin) {
        this.salones = salones;
        this.suites = suites;
        this.limusin = limusin;
    }

    public Hotel5(Integer salones, Integer suites, Integer limusin, Integer habitaciones, Integer camas, Integer pisos, Character gimnasio, String restoran, Integer capRestoran, Double precioHab) {
        super(habitaciones, camas, pisos, gimnasio, restoran, capRestoran, precioHab);
        this.salones = salones;
        this.suites = suites;
        this.limusin = limusin;
    }

    public Hotel5(Integer salones, Integer suites, Integer limusin, Integer habitaciones, Integer camas, Integer pisos, Character gimnasio, String restoran, Integer capRestoran, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, gimnasio, restoran, capRestoran, nombre, direccion, localidad, gerente);
        this.salones = salones;
        this.suites = suites;
        this.limusin = limusin;
    }

    @Override
    public Integer valorGim() {
        return super.valorGim(); 
    }

    @Override
    public Integer valorRestoran() {
        return super.valorRestoran(); 
    }

    @Override
    public void precioPorHabitacion() {
        precioHab = (double) 50 + ((1*super.getCamas())+ valorRestoran() + valorGim() + valorLimusin()); 
    }
    
    public Integer valorLimusin(){
        return 15*limusin;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "salones=" + salones + ", suites=" + suites + ", limusin=" + limusin + "precio hab: " + super.getPrecioHab() + '}';
    }
}
