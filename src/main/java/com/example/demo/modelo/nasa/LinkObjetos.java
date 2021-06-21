/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo.nasa;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author ck
 */
public class LinkObjetos implements Serializable {

    private static final long serialVersionUID = 12L;
    @JsonProperty("self")
    public String link;

    public LinkObjetos() {
    }

    public LinkObjetos(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "LinkObjetos{" + "link=" + link + '}';
    }

}
