/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo.nasa;

import java.io.Serializable;

/**
 *
 * @author ck
 */
public class Meters implements Serializable {

    private static final long serialVersionUID = 5L;
    private double estimated_diameter_min;
    private double estimated_diameter_max;

    public Meters(double estimated_diameter_min, double estimated_diameter_max) {
        this.estimated_diameter_min = estimated_diameter_min;
        this.estimated_diameter_max = estimated_diameter_max;
    }

    public Meters() {
    }

    public double getEstimated_diameter_min() {
        return estimated_diameter_min;
    }

    public void setEstimated_diameter_min(double estimated_diameter_min) {
        this.estimated_diameter_min = estimated_diameter_min;
    }

    public double getEstimated_diameter_max() {
        return estimated_diameter_max;
    }

    public void setEstimated_diameter_max(double estimated_diameter_max) {
        this.estimated_diameter_max = estimated_diameter_max;
    }

    @Override
    public String toString() {
        return "Meters{" + "estimated_diameter_min=" + estimated_diameter_min + ", estimated_diameter_max=" + estimated_diameter_max + '}';
    }
}
