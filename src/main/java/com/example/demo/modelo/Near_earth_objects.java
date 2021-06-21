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
public class Near_earth_objects implements Serializable {

    private static final long serialVersionUID = 12;
    /* tiene una fecha y algo mas dentro que le meto?*/
    private Date fecha;
    private DatosAsteroides datos;

    public Near_earth_objects(DatosAsteroides datos) {
        this.datos = datos;
    }

    public Near_earth_objects() {
    }

    public DatosAsteroides getDatos() {
        return datos;
    }

    public void setDatos(DatosAsteroides datos) {
        this.datos = datos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Near_earth_objects{" + "fecha=" + fecha + ", datos=" + datos + '}';
    }
}
