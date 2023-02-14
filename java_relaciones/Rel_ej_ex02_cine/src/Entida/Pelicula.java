/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entida;


public class Pelicula {

    private String titule;
    private int duracion;
    private int edadmin;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titule, int duracion, int edadmin, String director) {
        this.titule = titule;
        this.duracion = duracion;
        this.edadmin = edadmin;
        this.director = director;
    }

    public String getTitule() {
        return titule;
    }

    public void setTitule(String titule) {
        this.titule = titule;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadmin() {
        return edadmin;
    }

    public void setEdadmin(int edadmin) {
        this.edadmin = edadmin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    

}
   