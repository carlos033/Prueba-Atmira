/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controlador;

import com.example.demo.modelo.DatosNasa;
import com.example.demo.servicioI.ServicioI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ck
 */
@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private ServicioI servicios;

    @GetMapping
    @ResponseBody
    public DatosNasa obtenerDatos() {
        DatosNasa datos = servicios.obtenerDatos();
        return datos;
    }
}
