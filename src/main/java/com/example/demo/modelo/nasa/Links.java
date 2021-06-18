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
public class Links implements Serializable {

    private static final long serialVersionUID = 9L;
    private String self;

    public Links(String self) {
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

    @Override
    public String toString() {
        return "Links{" + "self=" + self + '}';
    }

}
