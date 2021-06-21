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
public class Estimated_diameter implements Serializable {

    private static final long serialVersionUID = 3L;
    private Kilometers kilometros;
    private Meters metros;
    private Miles millas;
    private Feet pies;

    public Estimated_diameter(Kilometers kilometros, Meters metros, Miles millas, Feet pies) {
        this.kilometros = kilometros;
        this.metros = metros;
        this.millas = millas;
        this.pies = pies;
    }

    public Estimated_diameter() {
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