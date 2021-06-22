/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ck
 */
public class Asteroide implements Serializable, Comparable<Asteroide> {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private double diametro;
    private double velocidad;
    private LocalDate fecha;
    private String planeta;

    public Asteroide(String nombre, double diametro, double velocidad, LocalDate fecha, String planeta) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.velocidad = velocidad;
        this.fecha = fecha;
        this.planeta = planeta;
    }

    public Asteroide() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "Asteroide:"
                + "\n nombre:" + nombre
                + "\n diametro: " + diametro
                + "\n velocidad:" + velocidad
                + "\n fecha: " + fecha
                + "\n planeta sobre le que orbita:" + planeta + '\n';
    }

    @Override
    public int compareTo(Asteroide o) {
        if (getDiametro() >= o.getDiametro()) {
            return -1;
        } else {
            return 1;
        }
    }
}
