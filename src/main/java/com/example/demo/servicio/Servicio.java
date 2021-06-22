/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicio;

import com.example.demo.errores.ExcepcionServicio;
import com.example.demo.modelo.Asteroide;
import javax.transaction.Transactional;
import com.example.demo.modelo.DatosNasa;
import com.example.demo.modelo.nasa.CloseApproachData;
import com.example.demo.modelo.nasa.NearEarthObjectsDetails;
import com.example.demo.servicioI.ServicioI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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

    @Override
    public List<Asteroide> obtenerDatosAsteroides(String planeta) throws ExcepcionServicio {
        List<Asteroide> listaObjetos = new ArrayList<>();
        LocalDate today = LocalDate.now();
        Map<String, List<NearEarthObjectsDetails>> listaAsteroides = new HashMap<>();
        DatosNasa datos = obtenerDatos();
        listaAsteroides = datos.getListaObjetos();
        for (Map.Entry<String, List<NearEarthObjectsDetails>> entry : listaAsteroides.entrySet()) {
            for (NearEarthObjectsDetails item : entry.getValue()) {
                if (item.isIs_potentially_hazardous_asteroid() == true) {
                    item.getDatosAproximacion().stream().filter(data -> (data.getCuerpoOrbital().compareToIgnoreCase(planeta) == 0)).forEachOrdered(data -> {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
                        String date = data.getDatosAproximacion();
                        LocalDate date1 = LocalDate.parse(date, formatter);
                        if (date1.isBefore(today.plusDays(7)) && date1.isAfter(today)) {
                            double diametro = (item.getDiametro().getKilometros().getDiametroMax()
                                    + item.getDiametro().getKilometros().getDiametroMin()) / 2;
                            Asteroide asteroide = new Asteroide();
                            asteroide.setFecha(date1);
                            asteroide.setDiametro(diametro);
                            asteroide.setNombre(item.getName());
                            asteroide.setVelocidad(data.getVelocidades().getKmXH());
                            asteroide.setPlaneta(planeta);
                            listaObjetos.add(asteroide);
                        }
                    });
                    listaObjetos.sort((o1, o2) -> Double.compare(o2.getDiametro(), o1.getDiametro()));
                    for (int i = 3; i <= listaObjetos.size(); ++i) {
                        listaObjetos.remove(i);
                    }
                } else {
                    throw new ExcepcionServicio("El planeta no existe o no tiene asteroides orbitando en los proximos 7 dias");
                }
            }

        }
        return listaObjetos;
    }

}
