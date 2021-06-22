/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author ck
 */
public class AsteroidesXFecha implements Serializable {

    private static final long serialVersionUID = 10L;
    @JsonProperty("datos")
    private DatosAsteroides datos;

    public DatosAsteroides getDatos() {
        return datos;
    }

    public void setDatos(DatosAsteroides datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "AsteroidesXFecha{" + "datos=" + datos + '}';
    }

}
