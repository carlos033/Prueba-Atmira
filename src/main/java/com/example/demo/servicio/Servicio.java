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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
        String hoy = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        LocalDate date = LocalDate.now();
        date = date.plusDays(7);
        Date hoyEn7DiasFecha = java.util.Date.from(date.atStartOfDay(ZoneId.of("Europe/Madrid")).toInstant());
        String hoyEn7Dias = new SimpleDateFormat("yyyy-MM-dd").format(hoyEn7DiasFecha);
        final String uri = "https://api.nasa.gov/neo/rest/v1/feed?start_date=" + hoy + "&end_date=" + hoyEn7Dias + "&api_key=zdUP8ElJv1cehFM0rsZVSQN7uBVxlDnu4diHlLSb";
        RestTemplate restTemplate = new RestTemplate();
        DatosNasa result = restTemplate.getForObject(uri, DatosNasa.class);
        return result;
    }

    @Override
    public List<Asteroide> obtenerDatosAsteroides(String planeta) throws ExcepcionServicio, ParseException {
        List<Asteroide> listaObjetos = new ArrayList<>();
        LocalDate today = LocalDate.now();
        Map<String, List<NearEarthObjectsDetails>> listaAsteroides = new HashMap<>();
        DatosNasa datos = obtenerDatos();
        listaAsteroides = datos.getListaObjetos();
        for (Map.Entry<String, List<NearEarthObjectsDetails>> entry : listaAsteroides.entrySet()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
            String date = entry.getKey();
            Date formatted = new SimpleDateFormat("yyyy-mm-dd").parse(date);
            LocalDate date1 = formatted.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (date1.isBefore(today.plusDays(7)) && date1.isAfter(today)) {
                for (NearEarthObjectsDetails item : entry.getValue()) {
                    if (item.isIs_potentially_hazardous_asteroid() == true) {
                        for (CloseApproachData data : item.getDatosAproximacion()) {
                            if (data.getCuerpoOrbital().compareToIgnoreCase(planeta) == 0) {
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
                        }
                    }
                }
            }
        }
        if (listaObjetos.isEmpty()) {
            throw new ExcepcionServicio("El planeta no existe o no tiene asteroides orbitando en los proximos 7 dias");
        }
        return listaObjetos;
    }
}
