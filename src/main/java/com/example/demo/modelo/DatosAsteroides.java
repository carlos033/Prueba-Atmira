/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.example.demo.modelo.nasa.Close_approach_data;
import com.example.demo.modelo.nasa.Estimated_diameter;
import com.example.demo.modelo.nasa.Links;
import java.io.Serializable;

/**
 *
 * @author ck
 */
public class DatosAsteroides implements Serializable {

    private static final long serialVersionUID = 2L;
    private Links links;
    private int id;
    private String name;
    private String nasa_jpl_url;
    private double absolute_magnitude_h;
    private Estimated_diameter estimated_diameter;
    private boolean is_potentially_hazardous_asteroid;
    private Close_approach_data close_approach_data;
    private boolean is_sentry_object;

    public DatosAsteroides(int id, String name, String nasa_jpl_url, double absolute_magnitude_h, Estimated_diameter diametro, boolean is_potentially_hazardous_asteroid, Close_approach_data datosDAproximacion, boolean is_sentry_object) {
        this.id = id;
        this.name = name;
        this.nasa_jpl_url = nasa_jpl_url;
        this.absolute_magnitude_h = absolute_magnitude_h;
        this.estimated_diameter = diametro;
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
        this.close_approach_data = datosDAproximacion;
        this.is_sentry_object = is_sentry_object;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNasa_jpl_url() {
        return nasa_jpl_url;
    }

    public void setNasa_jpl_url(String nasa_jpl_url) {
        this.nasa_jpl_url = nasa_jpl_url;
    }

    public double getAbsolute_magnitude_h() {
        return absolute_magnitude_h;
    }

    public void setAbsolute_magnitude_h(double absolute_magnitude_h) {
        this.absolute_magnitude_h = absolute_magnitude_h;
    }

    public Estimated_diameter getEstimated_diameter() {
        return estimated_diameter;
    }

    public void setEstimated_diameter(Estimated_diameter estimated_diameter) {
        this.estimated_diameter = estimated_diameter;
    }

    public boolean isIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }

    public void setIs_potentially_hazardous_asteroid(boolean is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }

    public Close_approach_data getClose_approach_data() {
        return close_approach_data;
    }

    public void setClose_approach_data(Close_approach_data close_approach_data) {
        this.close_approach_data = close_approach_data;
    }

    public boolean isIs_sentry_object() {
        return is_sentry_object;
    }

    public void setIs_sentry_object(boolean is_sentry_object) {
        this.is_sentry_object = is_sentry_object;
    }

    @Override
    public String toString() {
        return "DatosNasa{" + "id=" + id + ", name=" + name + ", nasa_jpl_url=" + nasa_jpl_url + ", absolute_magnitude_h=" + absolute_magnitude_h + ", diametro=" + estimated_diameter + ", is_potentially_hazardous_asteroid=" + is_potentially_hazardous_asteroid + ", datosDAproximacion=" + close_approach_data + ", is_sentry_object=" + is_sentry_object + '}';
    }
    
    
}
