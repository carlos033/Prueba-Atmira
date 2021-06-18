/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ck
 */
public class Asteroide implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private double diametro;
    private double velocidad;
    private Date fecha;
    private String planeta;

    public Asteroide(String nombre, double diametro, double velocidad, Date fecha, String planeta) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
        return "Asteroide{" + "nombre=" + nombre + ", diametro=" + diametro + ", velocidad=" + velocidad + ", fecha=" + fecha + ", planeta=" + planeta + '}';
    }

}
