
package Entidades;

import java.util.Scanner;


public class Electrodomestico {
    
    protected Double precio;
    protected String color;
    protected char consumo;
    protected Float peso;

 
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Electrodomestico(Double precio, String color, char consumo, Float peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    
    public void consumoEnergetico(char consumo){
        switch(consumo){
            case 'a': this.consumo='a';
            break;
            case 'b': this.consumo='b';
            break;
            case 'c': this.consumo='c';
            break;
            case 'd': this.consumo='d';
            break; 
            case 'e': this.consumo='e';
            break;
            case 'f': this.consumo='f';
            break;
            default: this.consumo='f';
        }
    }
    public void comprobarColor(String color){
        
        switch(color.toLowerCase()){
            case "blanco": this.color="blanco";
            break;
            case "negro": this.color="negro";
            break;
            case "azul": this.color="azul";
            break;
            case "gris" : this.color="gris";
            break; 
            case "rojo" : this.color="rojo";
            break;
            
            default: this.color= "blanco";
        }
    }
    public void precioFinal(char consumo, Double precio){
        Double aux = precio;
        switch(consumo){
            case 'a': this.precio = aux + 1000d;
            break;
            case 'b': this.precio= aux + 800d;
            break;
            case 'c': this.precio= aux + 600d;
            break;
            case 'd': this.precio= aux + 500d;
            break; 
            case 'e': this.precio= aux + 300d;
            break;
            case 'f': this.precio= aux + 100d;
            break;
            default: this.precio= aux + 100d ;
        } 
        precioFinalII(this.peso, this.precio);
    }
    private void precioFinalII(Float peso, Double precio){
        if(peso>=1 && peso<=19){
            this.precio = this.precio + 100d;
        }else if (peso>=20 && peso<=49){
         this.precio = this.precio + 500d;   
        } else if (peso>=50 && peso<=79){
            this.precio = this.precio + 800d;
        } else{
            this.precio = this.precio + 1000d;
        }
    }
    
Scanner scan;

      public Electrodomestico() {
        scan =  new Scanner(System.in).useDelimiter("\n");
    }

        
   
    public void crearElec(){
        System.out.println("Coloque su precio:");
        Double precio = scan.nextDouble();
        System.out.println("Cual es su color:");
        String color = scan.next();
        System.out.println("Cual es su tipo de consumo: A, B, C, D, E, o F");
        char tipo = scan.next().charAt(0);
        System.out.println("Cual es su peso en kg");
        Float peso = scan.nextFloat();
        System.out.println("Completaste las caraterísticas");
        System.out.println(" ");
        this.precio=precio;
        this.color=color;
        this.consumo= consumo;
        this.peso= peso;
        
    } 
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
    
    
}
