/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ck
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Near_earth_objects implements Serializable {

    private static final long serialVersionUID = 12;
    private Date fecha;
    private DatosAsteroides[] datos;

    public Near_earth_objects(){}
    
    public Near_earth_objects(Date fecha, DatosAsteroides[] datos) {
        this.fecha = fecha;
        this.datos = datos;
    }

    public DatosAsteroides[] getDatos() {
        return datos;
    }

    public void setDatos(DatosAsteroides[] datos) {
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
    
    @JsonIgnore
    public List<DatosAsteroides> datosArray() {
        List<DatosAsteroides> listaDatos = Arrays.asList(getDatos());
        return listaDatos;
    }
}
