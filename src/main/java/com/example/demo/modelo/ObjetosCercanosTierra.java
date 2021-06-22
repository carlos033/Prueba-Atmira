/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ck
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjetosCercanosTierra implements Serializable {

    private static final long serialVersionUID = 12;
    private Map<String, List<DatosAsteroides>> listaDatos = new HashMap<String, List<DatosAsteroides>>();

    public ObjetosCercanosTierra() {
    }

    public Map<String, List<DatosAsteroides>> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(Map<String, List<DatosAsteroides>> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @Override
    public String toString() {
        return "ObjetosCercanosTierra{" + "listaDatos=" + listaDatos + '}';
    }

}
