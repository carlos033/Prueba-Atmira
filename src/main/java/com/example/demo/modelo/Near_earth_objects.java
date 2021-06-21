/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ck
 */
public class Near_earth_objects implements Serializable {

    private static final long serialVersionUID = 12;
    private Date fecha;
    private List<DatosAsteroides> datos;

    public Near_earth_objects(Date fecha, List<DatosAsteroides> datos) {
        this.fecha = fecha;
        this.datos = datos;
    }

    public Near_earth_objects() {
        datos = new ArrayList<>();
    }

    public List<DatosAsteroides> getDatos() {
        return datos;
    }

    public void setDatos(List<DatosAsteroides> datos) {
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
