/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo.nasa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author ck
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links implements Serializable {

    private static final long serialVersionUID = 9L;
    @JsonProperty("next")
    private String next;
    @JsonProperty("prev")
    private String prev;
    @JsonProperty("self")
    private String self;

    public Links(String next, String prev, String self) {
        this.next = next;
        this.prev = prev;
        this.self = self;
    }

    public Links() {
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Links{" + "next=" + next + ", prev=" + prev + ", self=" + self + '}';
    }
}
