/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonCreator;
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
public class ObjetosCercanosTierra implements Serializable {

    private static final long serialVersionUID = 12;
    private Date fecha;
    List<DatosAsteroides> listaDatos;

    @JsonCreator
    public ObjetosCercanosTierra() {
    }

    @JsonCreator
     public ObjetosCercanosTierra(Date fecha, List<DatosAsteroides> listaDatos) {
        this.fecha = fecha;
        this.listaDatos = listaDatos;
    }

    public List<DatosAsteroides> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<DatosAsteroides> listaDatos) {
        this.listaDatos = listaDatos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Near_earth_objects{" + "fecha=" + fecha + ", listaDatos=" + listaDatos + '}';
    }
   
}
