/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicioI;

import com.example.demo.errores.ExcepcionServicio;
import com.example.demo.modelo.Asteroide;
import com.example.demo.modelo.DatosNasa;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author ck
 */
public interface ServicioI {

    public DatosNasa obtenerDatos();

    public List<Asteroide> obtenerDatosAsteroides(String planeta) throws ExcepcionServicio, ParseException;

    public List<Asteroide> listaFiltrada(List<Asteroide> lista);
}
