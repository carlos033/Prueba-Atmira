package com.example.demo.modelo.nasa;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NearEarthObjectsDetails implements Serializable {

    private static final long serialVersionUID = 12;
    private Links links;
    private String id;
    private String neo_reference_ïd;
    private String name;
    @JsonProperty("absolute_magnitude_h")
    private String absoluteMagnitudeH;
    @JsonProperty("estimated_diameter")
    private EstimatedDiameter diametro;
    private boolean is_potentially_hazardous_asteroid;
    @JsonProperty("close_approach_data")
    private List<CloseApproachData> datosAproximacion;
    private boolean is_sentry_object;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNeo_reference_ïd() {
        return neo_reference_ïd;
    }

    public void setNeo_reference_ïd(String neo_reference_ïd) {
        this.neo_reference_ïd = neo_reference_ïd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbsoluteMagnitudeH() {
        return absoluteMagnitudeH;
    }

    public void setAbsoluteMagnitudeH(String absoluteMagnitudeH) {
        this.absoluteMagnitudeH = absoluteMagnitudeH;
    }

    public boolean isIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }

    public void setIs_potentially_hazardous_asteroid(boolean is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }

    public EstimatedDiameter getDiametro() {
        return diametro;
    }

    public void setDiametro(EstimatedDiameter diametro) {
        this.diametro = diametro;
    }

    public List<CloseApproachData> getDatosAproximacion() {
        return datosAproximacion;
    }

    public void setDatosAproximacion(List<CloseApproachData> datosAproximacion) {
        this.datosAproximacion = datosAproximacion;
    }

    public boolean isIs_sentry_object() {
        return is_sentry_object;
    }

    public void setIs_sentry_object(boolean is_sentry_object) {
        this.is_sentry_object = is_sentry_object;
    }

    @Override
    public String toString() {
        return "NearEarthObjectsDetails{" + "links=" + links + ", id=" + id + ", neo_reference_\u00efd=" + neo_reference_ïd + ", name=" + name + ", absoluteMagnitudeH=" + absoluteMagnitudeH + ", diametro=" + diametro + ", is_potentially_hazardous_asteroid=" + is_potentially_hazardous_asteroid + ", datosAproximacion=" + datosAproximacion + ", is_sentry_object=" + is_sentry_object + '}';
    }

}
