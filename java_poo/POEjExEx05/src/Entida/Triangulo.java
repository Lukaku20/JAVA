/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entida;

/**
 *
 * @author lukaku20
 */
public class Triangulo {
    
    double ladoA;
    double ladoB;
    double ladoC;
    double hipotenusa;
    double area;
    double perimetro;
    String id;

    public Triangulo() {
    }

    public Triangulo(double ladoA, double ladoB, double ladoC, double hipotenusa, double area, double perimetro, String id) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.hipotenusa = hipotenusa;
        this.area = area;
        this.perimetro = perimetro;
        this.id = id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
 

  

    @Override
    public String toString() {
        return "Triangulo " + id +": " + "lado A: " + ladoA + ", lado B: " + ladoB + ", lado C: " + ladoC +"\n"
                + "Hipotenusa: " + hipotenusa +"cm."+" Perímetro: " + perimetro +"cm."+" Area: " + area + "cm2.";
    }
    }
    

