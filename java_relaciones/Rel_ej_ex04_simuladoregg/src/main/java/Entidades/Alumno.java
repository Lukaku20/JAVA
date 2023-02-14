/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author siduncuNotebook
 */
public class Alumno implements Comparable<Alumno>{
    
    String nombreCompleto;
    Integer dni;
    Integer cantVotos;
    ArrayList<String> votosDados;

    public Alumno(){
        cantVotos=0;
        votosDados = new ArrayList<>();
    }

    public Alumno(String nombreCompleto, Integer dni, Integer cantVotos, ArrayList<String> votosDados) {
        this.nombreCompleto=nombreCompleto;
        this.dni = dni;
        this.cantVotos = cantVotos;
        this.votosDados = votosDados;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(Integer cantVotos) {
        this.cantVotos = cantVotos;
    }

    public ArrayList<String> getVotosDados() {
        return votosDados;
    }

    public void setVotosDados(ArrayList<String> votosDados) {
        this.votosDados = votosDados;
    }

    @Override
    public String toString() {
        return nombreCompleto + ", dni: " + dni + ", cantVotos: " + cantVotos ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.nombreCompleto);
        hash = 19 * hash + Objects.hashCode(this.dni);
        hash = 19 * hash + Objects.hashCode(this.cantVotos);
        hash = 19 * hash + Objects.hashCode(this.votosDados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombreCompleto, other.nombreCompleto)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.cantVotos, other.cantVotos)) {
            return false;
        }
        return Objects.equals(this.votosDados, other.votosDados);
    }

    @Override
    public int compareTo(Alumno t) {
        return this.nombreCompleto.compareTo(t.getNombreCompleto());
    }

    
}
