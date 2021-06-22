/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicio;

import com.example.demo.errores.ExcepcionServicio;
import javax.transaction.Transactional;
import com.example.demo.modelo.DatosNasa;
import com.example.demo.modelo.nasa.CloseApproachData;
import com.example.demo.modelo.nasa.NearEarthObjectsDetails;
import com.example.demo.servicioI.ServicioI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
        final String uri = "https://api.nasa.gov/neo/rest/v1/feed?start_date=2020-09-09&end_date=2020-09-16&api_key=DEMO_KEY";
        RestTemplate restTemplate = new RestTemplate();
        DatosNasa result = restTemplate.getForObject(uri, DatosNasa.class);
        return result;
    }

    public List<NearEarthObjectsDetails> datosAsteroides(String planeta) throws ExcepcionServicio {
        LocalDate today = LocalDate.now();
        Map<String, List<NearEarthObjectsDetails>> listaAsteroides = new HashMap<String, List<NearEarthObjectsDetails>>();
        List<NearEarthObjectsDetails> result = new ArrayList<>();
        DatosNasa datos = obtenerDatos();
        listaAsteroides = datos.getListaObjetos();
        for (Map.Entry<String, List<NearEarthObjectsDetails>> entry : listaAsteroides.entrySet()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd");
            String date = entry.getKey();
            LocalDate date1 = LocalDate.parse(date, formatter);
            if (date1.isBefore(today.plusDays(7)) && date1.isAfter(today)) {
                for (NearEarthObjectsDetails item : entry.getValue()) {
                    if(item.isIs_potentially_hazardous_asteroid()==true){
                    for (CloseApproachData data : item.getDatosAproximacion()) {
                        if (data.getCuerpoOrbital().compareToIgnoreCase(planeta) == 0) {
                          double diametro = (item.getDiametro().getKilometros().getDiametroMax() +
                                  item.getDiametro().getKilometros().getDiametroMin())/2;
                        } else {
                            throw new ExcepcionServicio("El planeta no existe o no tiene asteroides orbitando en los proximos 7 dias");
                        }
                    }
                }
            } }
        }
    }

}
