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
public class Relative_velocity implements Serializable {

    private static final long serialVersionUID = 8L;
    @JsonProperty("kilometers_per_second")
    private double kmXSeg;
    @JsonProperty("kilometers_per_hour")
    private double kmXH;
    @JsonProperty("miles_per_hour")
    private double mXH;

    public Relative_velocity(double kmXSeg, double kmXH, double mXH) {
        this.kmXSeg = kmXSeg;
        this.kmXH = kmXH;
        this.mXH = mXH;
    }

    public Relative_velocity() {
    }

    public double getKmXSeg() {
        return kmXSeg;
    }

    public void setKmXSeg(double kmXSeg) {
        this.kmXSeg = kmXSeg;
    }

    public double getKmXH() {
        return kmXH;
    }

    public void setKmXH(double kmXH) {
        this.kmXH = kmXH;
    }

    public double getmXH() {
        return mXH;
    }

    public void setmXH(double mXH) {
        this.mXH = mXH;
    }

    @Override
    public String toString() {
        return "Relative_velocity{" + "kmXSeg=" + kmXSeg + ", kmXH=" + kmXH + ", mXH=" + mXH + '}';
    }
}
