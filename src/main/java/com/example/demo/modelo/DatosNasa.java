/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.example.demo.modelo.nasa.Links;
import com.example.demo.modelo.nasa.NearEarthObjectsDetails;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ck
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatosNasa implements Serializable {

    private static final long serialVersionUID = 11L;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("element_count")
    private int numElementos;
    @JsonProperty("near_earth_objects")
    private Map<String, List<NearEarthObjectsDetails>> listaObjetos = new HashMap<String, List<NearEarthObjectsDetails>>();

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public Map<String, List<NearEarthObjectsDetails>> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(Map<String, List<NearEarthObjectsDetails>> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    @Override
    public String toString() {
        return "DatosNasa{" + "links=" + links + ", element_count=" + numElementos + ", Near_earth_objects=" + listaObjetos + '}';
    }

}
