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
public class Kilometers implements Serializable {

    private static final long serialVersionUID = 4L;
    @JsonProperty("estimated_diameter_min")
    private double diametroMin;
    @JsonProperty("estimated_diameter_max")
    private double diametroMax;

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
        return "Kilometers{" + "diametroMin=" + diametroMin + ", diametroMax=" + diametroMax + '}';
    }
}
