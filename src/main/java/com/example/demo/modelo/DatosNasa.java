/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.example.demo.modelo.nasa.Links;
import java.io.Serializable;

/**
 *
 * @author ck
 */
public class DatosNasa implements Serializable {

    private static final long serialVersionUID = 11L;
    /* tenemos 2 links uno con self y otro con 2 cosas mas como lo hago?*/
    private Links links;
    private int element_count;
    private Near_earth_objects near_earth_objects;

    public DatosNasa(Links links, int element_count, Near_earth_objects near_earth_objects) {
        this.links = links;
        this.element_count = element_count;
        this.near_earth_objects = near_earth_objects;
    }

    public DatosNasa() {
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public int getElement_count() {
        return element_count;
    }

    public void setElement_count(int element_count) {
        this.element_count = element_count;
    }

    public Near_earth_objects getNear_earth_objects() {
        return near_earth_objects;
    }

    public void setNear_earth_objects(Near_earth_objects near_earth_objects) {
        this.near_earth_objects = near_earth_objects;
    }

    @Override
    public String toString() {
        return "DatosNasa{" + "links=" + links + ", element_count=" + element_count + ", near_earth_objects=" + near_earth_objects + '}';
    }

}

    

