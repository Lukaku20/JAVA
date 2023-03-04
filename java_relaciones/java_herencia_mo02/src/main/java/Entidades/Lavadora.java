
package Entidades;



public class Lavadora extends Electrodomestico{
    
    private Float carga;

    public Lavadora() {
    }

    public Lavadora(Float carga) {
        this.carga = carga;
    }

    public Lavadora(Float carga, Double precio, String color, char consumo, Float peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Float getCarga() {
        return carga;
    }

    public void setCarga(Float carga) {
        this.carga = carga;
    }
   

    public void crearLavadora(){
        Lavadora a = new Lavadora();
        crearElec();
        Float carga;
        System.out.println(" Indique la carga: ");
        carga = scan.nextFloat();
        this.carga= carga;
        
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga: " + carga +
                " precio: $"+precio+" color: "+ color+ "\n"+ " consumo: " + consumo + " peso: "+peso+'}';
    }
}
