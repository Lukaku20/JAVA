/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entida;

/*           /\
/**         //\\
 *      ªªª///\\\ªªª
 * @author lukaku20
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia,int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.anio = año;
                }
    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 1900;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Date:  "  + dia + "|" + mes + "|" + anio + '.';
        //polaco Setting.
    }
    
}
