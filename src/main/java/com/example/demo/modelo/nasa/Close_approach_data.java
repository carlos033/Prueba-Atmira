/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo.nasa;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ck
 */
public class Close_approach_data implements Serializable {

    private static final long serialVersionUID = 7L;
    @JsonProperty("close_approach_data")
    private Date datosAproximacion;
    @JsonProperty("close_approach_date_full")
    private Date datosAproximacionCompleto;
    @JsonProperty("epoch_date_close_approach")
    private int aproximacionCercana;
    @JsonProperty("relative_velocity")
    private Relative_velocity velocidades;
    @JsonProperty("miss_distance")
    private Miss_distance distancias;
    @JsonProperty("orbiting_body")
    private String cuerpoOrbital;

    public Close_approach_data(Date datosAproximacion, Date datosAproximacionCompleto, int aproximacionCercana, Relative_velocity velocidades, Miss_distance distancias, String cuerpoOrbital) {
        this.datosAproximacion = datosAproximacion;
        this.datosAproximacionCompleto = datosAproximacionCompleto;
        this.aproximacionCercana = aproximacionCercana;
        this.velocidades = velocidades;
        this.distancias = distancias;
        this.cuerpoOrbital = cuerpoOrbital;
    }

    public Close_approach_data() {
    }

    public Date getDatosAproximacion() {
        return datosAproximacion;
    }

    public void setDatosAproximacion(Date datosAproximacion) {
        this.datosAproximacion = datosAproximacion;
    }

    public Date getDatosAproximacionCompleto() {
        return datosAproximacionCompleto;
    }

    public void setDatosAproximacionCompleto(Date datosAproximacionCompleto) {
        this.datosAproximacionCompleto = datosAproximacionCompleto;
    }

    public int getAproximacionCercana() {
        return aproximacionCercana;
    }

    public void setAproximacionCercana(int aproximacionCercana) {
        this.aproximacionCercana = aproximacionCercana;
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

    public String getCuerpoOrbital() {
        return cuerpoOrbital;
    }

    public void setCuerpoOrbital(String cuerpoOrbital) {
        this.cuerpoOrbital = cuerpoOrbital;
    }

    @Override
    public String toString() {
        return "Close_approach_data{" + "datosAproximacion=" + datosAproximacion + ", datosAproximacionCompleto=" + datosAproximacionCompleto + ", aproximacionCercana=" + aproximacionCercana + ", velocidades=" + velocidades + ", distancias=" + distancias + ", cuerpoOrbital=" + cuerpoOrbital + '}';
    }
}
