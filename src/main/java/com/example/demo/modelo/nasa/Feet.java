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
public class Feet implements Serializable {

    private static final long serialVersionUID = 7L;
    @JsonProperty("estimated_diameter_min")
    private double diametroMin;
    @JsonProperty("estimated_diameter_max")
    private double diametroMax;

    public Feet(double diametroMin, double diametroMax) {
        this.diametroMin = diametroMin;
        this.diametroMax = diametroMax;
    }

    public Feet() {
    }

    public double getDiametroMin() {
        return diametroMin;
    }

    public void setDiametroMin(double diametroMin) {
        this.diametroMin = diametroMin;
    }

    public double getDiametroMax() {
        return diametroMax;
    }

    public void setDiametroMax(double diametroMax) {
        this.diametroMax = diametroMax;
    }

    @Override
    public String toString() {
        return "Feet{" + "diametroMin=" + diametroMin + ", diametroMax=" + diametroMax + '}';
    }
}
