/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entida;



/**
 *
 * @author usuario
 */
public class Auto {
    
    String dueño;
    String vencimiento;
    String color;
    int modelo;
    int kilo;

    public Auto() {
    }

    public Auto(String dueño, String vencimiento, String color, int modelo, int kilo) {
        this.dueño = dueño;
        this.vencimiento = vencimiento;
        this.color = color;
        this.modelo = modelo;
        this.kilo = kilo;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    @Override
    public String toString() {
        return "Auto de " + dueño + ", vencimiento el " + vencimiento + ", color " + color +"\n"
                + "modelo " + modelo + " y " + kilo + " km.";
    }
    
    
}
