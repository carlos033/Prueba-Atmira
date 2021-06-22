/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controlador;

import com.example.demo.errores.ExcepcionServicio;
import com.example.demo.modelo.Asteroide;
import com.example.demo.modelo.DatosNasa;
import com.example.demo.servicioI.ServicioI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

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
    public List<Asteroide> obtenerDatosAsteroides(String planeta) {
        List<Asteroide> listaObjetos = new ArrayList<>();
        try {
            listaObjetos = servicios.obtenerDatosAsteroides(planeta);
        } catch (ExcepcionServicio ex) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, ex.getMessage());
        }
        return listaObjetos;
    }
}
