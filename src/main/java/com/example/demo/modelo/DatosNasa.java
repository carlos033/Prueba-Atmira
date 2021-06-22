/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.example.demo.modelo.nasa.Links;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

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
    private ObjetosCercanosTierra objetosCercanos;

    @JsonCreator
    public DatosNasa(Links links, int numElementos, ObjetosCercanosTierra objetosCercanos) {
        this.links = links;
        this.numElementos = numElementos;
        this.objetosCercanos = objetosCercanos;
    }

    @JsonCreator
    public DatosNasa() {
    }

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

    public ObjetosCercanosTierra objetosCercanos() {
        return objetosCercanos;
    }

    public void setObjetosCercanos(ObjetosCercanosTierra objetosCercanos) {
        this.objetosCercanos = objetosCercanos;
    }

    @Override
    public String toString() {
        return "DatosNasa{" + "links=" + links + ", element_count=" + numElementos + ", Near_earth_objects=" + objetosCercanos + '}';
    }

}
