package com.carreras.carreras.service;


import com.carreras.carreras.dto.PilotoDTO;
import com.carreras.carreras.model.Equipo;
import com.carreras.carreras.model.Piloto;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ICompeticionService {


    //Lista Equipos
    public List<Equipo> getTeams();

    // ii. Ver todos los pilotos registrados en la competencia
    public List<String> getAllPilotos();
    // ii. Ver todos los pilotos registrados en la competencia


    // ii. Ver todos los pilotos registrados en la competencia
    public Equipo buscarPorId(Integer id);


    //iv. Obtener todos los pilotos que formen parte de un equipo en específico
    public List<PilotoDTO> getDriverCompetition(Integer id);


}
