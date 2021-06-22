/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo.nasa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ck
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloseApproachData implements Serializable {

    private static final long serialVersionUID = 7L;
    @JsonProperty("close_approach_data")
    private String datosAproximacion;
    @JsonProperty("close_approach_date_full")
    private String datosAproximacionCompleto;
    @JsonProperty("epoch_date_close_approach")
    private long aproximacionCercana;
    @JsonProperty("relative_velocity")
    private RelativeVelocity velocidades;
    @JsonProperty("miss_distance")
    private MissDistance distancias;
    @JsonProperty("orbiting_body")
    private String cuerpoOrbital;

    public String getDatosAproximacion() {
        return datosAproximacion;
    }

    public void setDatosAproximacion(String datosAproximacion) {
        this.datosAproximacion = datosAproximacion;
    }

    public String getDatosAproximacionCompleto() {
        return datosAproximacionCompleto;
    }

    public void setDatosAproximacionCompleto(String datosAproximacionCompleto) {
        this.datosAproximacionCompleto = datosAproximacionCompleto;
    }

    public long getAproximacionCercana() {
        return aproximacionCercana;
    }

    public void setAproximacionCercana(long aproximacionCercana) {
        this.aproximacionCercana = aproximacionCercana;
    }

    public RelativeVelocity getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(RelativeVelocity velocidades) {
        this.velocidades = velocidades;
    }

    public MissDistance getDistancias() {
        return distancias;
    }

    public void setDistancias(MissDistance distancias) {
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
        return "CloseApproachData{" + "datosAproximacion=" + datosAproximacion + ", datosAproximacionCompleto=" + datosAproximacionCompleto + ", aproximacionCercana=" + aproximacionCercana + ", velocidades=" + velocidades + ", distancias=" + distancias + ", cuerpoOrbital=" + cuerpoOrbital + '}';
    }
}
