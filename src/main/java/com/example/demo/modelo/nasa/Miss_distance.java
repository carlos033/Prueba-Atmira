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
public class Miss_distance implements Serializable {

    private static final long serialVersionUID = 9L;
    @JsonProperty("astronomical")
    private double astronomical;
    @JsonProperty("lunar;")
    private double lunar;
    @JsonProperty("kilometers")
    private double kilometros;
    @JsonProperty("miles")
    private double millas;

    public Miss_distance(double astronomical, double lunar, double kilometros, double millas) {
        this.astronomical = astronomical;
        this.lunar = lunar;
        this.kilometros = kilometros;
        this.millas = millas;
    }

    public Miss_distance() {
    }

    public double getAstronomical() {
        return astronomical;
    }

    public void setAstronomical(double astronomical) {
        this.astronomical = astronomical;
    }

    public double getLunar() {
        return lunar;
    }

    public void setLunar(double lunar) {
        this.lunar = lunar;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double getMillas() {
        return millas;
    }

    public void setMillas(double millas) {
        this.millas = millas;
    }

    @Override
    public String toString() {
        return "Miss_distance{" + "astronomical=" + astronomical + ", lunar=" + lunar + ", kilometros=" + kilometros + ", millas=" + millas + '}';
    }
}
