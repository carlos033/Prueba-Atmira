/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.example.demo.modelo.nasa.CloseApproachData;
import com.example.demo.modelo.nasa.EstimatedDiameter;
import com.example.demo.modelo.nasa.LinkObjetos;
import com.example.demo.modelo.nasa.Links;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author ck
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatosAsteroides implements Serializable {

    private static final long serialVersionUID = 2L;
    @JsonProperty("links")
    private LinkObjetos links;
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String nombre;
    @JsonProperty("nasa_jpl_url")
    private String url;
    @JsonProperty("absolute_magnitude_h")
    private double magnitudes;
    @JsonProperty("estimated_diameter")
    private EstimatedDiameter diametro;
    @JsonProperty("is_potentially_hazardous_asteroid")
    private boolean esPeligroso;
    @JsonProperty("close_approach_data")
    private CloseApproachData datosAproximacion;
    @JsonProperty("is_sentry_object")
    private boolean IsSentryObject;

    @JsonCreator
    public DatosAsteroides(LinkObjetos links, int id, String nombre, String url, double magnitudes, EstimatedDiameter diametro, boolean esPeligroso, CloseApproachData datosAproximacion, boolean IsSentryObject) {
        this.links = links;
        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.magnitudes = magnitudes;
        this.diametro = diametro;
        this.esPeligroso = esPeligroso;
        this.datosAproximacion = datosAproximacion;
        this.IsSentryObject = IsSentryObject;
    }

    @JsonCreator
    public DatosAsteroides() {
    }

    public LinkObjetos getLinks() {
        return links;
    }

    public void setLinks(LinkObjetos links) {
        this.links = links;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getMagnitudes() {
        return magnitudes;
    }

    public void setMagnitudes(double magnitudes) {
        this.magnitudes = magnitudes;
    }

    public EstimatedDiameter getDiametro() {
        return diametro;
    }

    public void setDiametro(EstimatedDiameter diametro) {
        this.diametro = diametro;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }

    public void setEsPeligroso(boolean esPeligroso) {
        this.esPeligroso = esPeligroso;
    }

    public CloseApproachData getDatosAproximacion() {
        return datosAproximacion;
    }

    public void setDatosAproximacion(CloseApproachData datosAproximacion) {
        this.datosAproximacion = datosAproximacion;
    }

    public boolean isIsSentryObject() {
        return IsSentryObject;
    }

    public void setIsSentryObject(boolean IsSentryObject) {
        this.IsSentryObject = IsSentryObject;
    }

    @Override
    public String toString() {
        return "DatosAsteroides{" + "links=" + links + ", id=" + id + ", nombre=" + nombre + ", url=" + url + ", magnitudes=" + magnitudes + ", diametro=" + diametro + ", esPeligroso=" + esPeligroso + ", datosAproximacion=" + datosAproximacion + ", IsSentryObject=" + IsSentryObject + '}';
    }
}
