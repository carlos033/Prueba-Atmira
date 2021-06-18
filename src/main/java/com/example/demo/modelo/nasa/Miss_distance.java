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
public class Miss_distance implements Serializable {

    private static final long serialVersionUID = 9L;
    private double astronomical;
    private double lunar;
    private double kilometers;
    private double miles;

    public Miss_distance(double astronomical, double lunar, double kilometers, double miles) {
        this.astronomical = astronomical;
        this.lunar = lunar;
        this.kilometers = kilometers;
        this.miles = miles;
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

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return "Miss_distance{" + "astronomical=" + astronomical + ", lunar=" + lunar + ", kilometers=" + kilometers + ", miles=" + miles + '}';
    }

}
