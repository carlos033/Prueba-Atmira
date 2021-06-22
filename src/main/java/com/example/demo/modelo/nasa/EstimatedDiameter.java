/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo.nasa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author ck
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EstimatedDiameter implements Serializable {

    private static final long serialVersionUID = 3L;
    @JsonProperty("kilometers")
    private Kilometers kilometros;
    @JsonProperty("meters")
    private Meters metros;
    @JsonProperty("miles")
    private Miles millas;
    @JsonProperty("feet")
    private Feet pies;

    public EstimatedDiameter(Kilometers kilometros, Meters metros, Miles millas, Feet pies) {
        this.kilometros = kilometros;
        this.metros = metros;
        this.millas = millas;
        this.pies = pies;
    }

    public EstimatedDiameter() {
    }

    public Kilometers getKilometros() {
        return kilometros;
    }

    public void setKilometros(Kilometers kilometros) {
        this.kilometros = kilometros;
    }

    public Meters getMetros() {
        return metros;
    }

    public void setMetros(Meters metros) {
        this.metros = metros;
    }

    public Miles getMillas() {
        return millas;
    }

    public void setMillas(Miles millas) {
        this.millas = millas;
    }

    public Feet getPies() {
        return pies;
    }

    public void setPies(Feet pies) {
        this.pies = pies;
    }

    @Override
    public String toString() {
        return "Estimated_diameter{" + "kilometros=" + kilometros + ", metros=" + metros + ", millas=" + millas + ", pies=" + pies + '}';
    }
}
