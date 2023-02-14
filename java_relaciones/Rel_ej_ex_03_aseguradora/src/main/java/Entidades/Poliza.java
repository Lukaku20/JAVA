/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author siduncuNotebook
 */
public class Poliza {
    
    private Integer poliza;
    private LocalDate fechainicio;
    private LocalDate fechafin;
    private Integer cuotas;
    private Float montoasegurado;
    private Boolean granizo;
    private Float montogranizo;
    private String tipo;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Poliza() {
        
    }

    public Poliza(Integer poliza, LocalDate fechainicio, LocalDate fechafin, Integer cuotas, Float montoasegurado, Boolean granizo, Float montogranizo, String tipo, Cliente cliente, Vehiculo vehiculo) {
        this.poliza = poliza;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.cuotas = cuotas;
        this.montoasegurado = montoasegurado;
        this.granizo = granizo;
        this.montogranizo = montogranizo;
        this.tipo = tipo;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Integer getPoliza() {
        return poliza;
    }

    public void setPoliza(Integer poliza) {
        this.poliza = poliza;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public Float getMontoasegurado() {
        return montoasegurado;
    }

    public void setMontoasegurado(Float montoasegurado) {
        this.montoasegurado = montoasegurado;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public Float getMontogranizo() {
        return montogranizo;
    }

    public void setMontogranizo(Float montogranizo) {
        this.montogranizo = montogranizo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Poliza{" + "poliza=" + poliza + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", cuotas=" + cuotas + ", montoasegurado=" + montoasegurado + ", granizo=" + granizo + ", montogranizo=" + montogranizo + ", tipo=" + tipo + ", cliente=" + cliente + ", vehiculo=" + vehiculo + '}';
    }
    
}
