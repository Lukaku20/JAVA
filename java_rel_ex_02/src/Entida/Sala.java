/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entida;

/**
 */
public class Sala {

   private Pelicula film;
   private String[][] sala = new String[8][6];
   private int entrada;

    public Sala() {
    }

    public Sala(Pelicula film, int entrada) {
        this.film = film;
        this.entrada = entrada;
    }

    public Pelicula getFilm() {
        return film;
    }

    public void setFilm(Pelicula film) {
        this.film = film;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
   
   
    
}
