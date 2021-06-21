/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicio;

import javax.transaction.Transactional;
import com.example.demo.modelo.DatosNasa;
import com.example.demo.servicioI.ServicioI;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ck
 */
@Service("ServiciosI")
@Transactional
public class Servicio implements ServicioI {

    @Override
    public DatosNasa obtenerDatos() {
        final String uri = "https://api.nasa.gov/neo/rest/v1/feed?start_date=2020-09-09&end_date=2020-09-16&api_key=DEMO_KEY";
        RestTemplate restTemplate = new RestTemplate();
        DatosNasa result = restTemplate.getForObject(uri, DatosNasa.class);
        return result;
    }

}
