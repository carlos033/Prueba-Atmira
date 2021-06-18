/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo.nasa;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ck
 */
public class Close_approach_data implements Serializable {

    private static final long serialVersionUID = 7L;
    private Date close_approach_data;
    private Date close_approach_date_full;
    private int epoch_date_close_approach;
    private Relative_velocity velocidades;
    private Miss_distance distancias;
    private String orbiting_body;

    public Close_approach_data(Date close_approach_data, Date close_approach_date_full, int epoch_date_close_approach, Relative_velocity velocidades, Miss_distance distancias, String orbiting_body) {
        this.close_approach_data = close_approach_data;
        this.close_approach_date_full = close_approach_date_full;
        this.epoch_date_close_approach = epoch_date_close_approach;
        this.velocidades = velocidades;
        this.distancias = distancias;
        this.orbiting_body = orbiting_body;
    }

    public Close_approach_data() {
    }

    public Date getClose_approach_data() {
        return close_approach_data;
    }

    public void setClose_approach_data(Date close_approach_data) {
        this.close_approach_data = close_approach_data;
    }

    public Date getClose_approach_date_full() {
        return close_approach_date_full;
    }

    public void setClose_approach_date_full(Date close_approach_date_full) {
        this.close_approach_date_full = close_approach_date_full;
    }

    public int getEpoch_date_close_approach() {
        return epoch_date_close_approach;
    }

    public void setEpoch_date_close_approach(int epoch_date_close_approach) {
        this.epoch_date_close_approach = epoch_date_close_approach;
    }

    public Relative_velocity getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(Relative_velocity velocidades) {
        this.velocidades = velocidades;
    }

    public Miss_distance getDistancias() {
        return distancias;
    }

    public void setDistancias(Miss_distance distancias) {
        this.distancias = distancias;
    }

    public String getOrbiting_body() {
        return orbiting_body;
    }

    public void setOrbiting_body(String orbiting_body) {
        this.orbiting_body = orbiting_body;
    }

}
