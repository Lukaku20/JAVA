
package Entidades;

/**
 * @author lukaku20
 */
public class Hotel4 extends Alojamiento{
    
    protected Integer habitaciones;
    protected Integer camas;
    protected Integer pisos;
    protected Character gimnasio;
    protected String restoran;
    protected Integer capRestoran;
    protected Double precioHab;

    public Hotel4() {
    }

    public Hotel4(Integer habitaciones, Integer camas, Integer pisos, Character gimnasio, String restoran, Integer capRestoran, Double precioHab) {
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.gimnasio = gimnasio;
        this.restoran = restoran;
        this.capRestoran = capRestoran;
        this.precioHab = precioHab;
    }

    public Hotel4(Integer habitaciones, Integer camas, Integer pisos, Character gimnasio, String restoran, Integer capRestoran, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.gimnasio = gimnasio;
        this.restoran = restoran;
        this.capRestoran = capRestoran;
        
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(Double precioHab) {
        this.precioHab = precioHab;
    }
    
    @Override
    public void precioPorHabitacion(){
        this.precioHab =  (double) 50 + ((1*camas)+ valorRestoran() + valorGim());
    }
    
    public Integer valorRestoran(){
        int devuelve=0;
        if(capRestoran < 30){
            devuelve = 10;
        } else if (capRestoran>30 && capRestoran<=50){
            devuelve = 30;
        } else if (capRestoran>50){
            devuelve =50;
        }
        
        return devuelve;
    }
    public Integer valorGim(){
        char gim = Character.toUpperCase(gimnasio);
        int devuelve=0;
        if(gim=='A'){
            devuelve = 50;
        } else if(gim=='B'){
            devuelve = 30;
        }
        return devuelve;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + ", gimnasio=" + gimnasio + ", restoran=" + restoran + ", capRestoran=" + capRestoran + ", precioHab=" + precioHab + '}';
    }
    
    
}
