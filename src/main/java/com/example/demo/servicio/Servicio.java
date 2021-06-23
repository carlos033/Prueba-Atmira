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
import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Servicio
 *
 * @author ck
 */
@Service("ServiciosI")
@Transactional
public class Servicio implements ServicioI {

    /**
     * Metodo para obtener los datos del EndPoint
     *
     * @return
     */
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

    /**
     * Metodo que permite obtener los datos de los asteroides que orbitan a un
     * planeta dado y que sean peligrosos
     *
     * @param planeta
     * @return
     * @throws ExcepcionServicio
     * @throws ParseException
     */
    @Override
    public List<Asteroide> obtenerDatosAsteroides(String planeta) throws ExcepcionServicio, ParseException {
        List<Asteroide> asteroideList = new ArrayList<>();
        Map<String, List<NearEarthObjectsDetails>> listaAsteroides = obtenerDatos().getListaObjetos();
        for (Map.Entry<String, List<NearEarthObjectsDetails>> entry : listaAsteroides.entrySet()) {
            for (NearEarthObjectsDetails item : entry.getValue()) {
                for (CloseApproachData datosAprox : item.getDatosAproximacion()) {
                    if (datosAprox.getCuerpoOrbital().compareToIgnoreCase(planeta) == 0 && item.isIs_potentially_hazardous_asteroid()) {
                        Asteroide asteroide = new Asteroide();
                        asteroide.setNombre(item.getName());
                        asteroide.setDiametro((item.getDiametro().getKilometros().getDiametroMax() + item.getDiametro().getKilometros().getDiametroMin()) / 2);
                        Date dateFormatted = new SimpleDateFormat("yyyy-MM-dd").parse(datosAprox.getDatosAproximacion());
                        asteroide.setFecha(dateFormatted.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                        asteroide.setPlaneta(datosAprox.getCuerpoOrbital());
                        asteroide.setVelocidad(datosAprox.getVelocidades().getKmXH());
                        asteroideList.add(asteroide);
                    }
                }
            }
        }
        if (asteroideList.isEmpty()) {
            throw new ExcepcionServicio("El planeta no existe o no tiene asteroides orbitando en los proximos 7 dias o ninguno es peligroso");
        }
        return asteroideList;
    }

    /**
     * Permite ordenar la lista y sacar como maximo los 3 mas grandes
     *
     * @param lista
     * @return
     */
    @Override
    public List<Asteroide> listaFiltrada(List<Asteroide> lista) {
        Collections.sort(lista);
        if (lista.size() >= 3) {
            lista = lista.subList(0, 3);
        }
        return lista;
    }
}
