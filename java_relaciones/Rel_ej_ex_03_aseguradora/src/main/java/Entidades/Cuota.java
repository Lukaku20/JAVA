/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author siduncuNotebook
 */
public class Cuota implements Comparable<Cuota>{
    private Integer numero;
    private Float monto;
    private Boolean pago;
    private LocalDate vencimiento;
    private String forma;

    public Cuota() {
        
    }

    public Cuota(Integer numero, Float monto, Boolean pago, LocalDate vencimiento, String forma) {
        this.numero = numero;
        this.monto = monto;
        this.pago = pago;
        this.vencimiento = vencimiento;
        this.forma = forma;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Cuota: " + numero + " por " + monto + ", pago: " + pago + "venc:" + vencimiento ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.numero);
        hash = 19 * hash + Objects.hashCode(this.monto);
        hash = 19 * hash + Objects.hashCode(this.pago);
        hash = 19 * hash + Objects.hashCode(this.vencimiento);
        hash = 19 * hash + Objects.hashCode(this.forma);
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
        final Cuota other = (Cuota) obj;
        if (!Objects.equals(this.forma, other.forma)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.monto, other.monto)) {
            return false;
        }
        if (!Objects.equals(this.pago, other.pago)) {
            return false;
        }
        return Objects.equals(this.vencimiento, other.vencimiento);
    }

    @Override
    public int compareTo(Cuota t) {
        return this.numero.compareTo(t.getNumero());
    }
    
    
}
