package com.carreras.carreras.service;

import com.carreras.carreras.dto.PilotoDTO;
import com.carreras.carreras.model.Equipo;
import com.carreras.carreras.model.Piloto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class CompeticionService implements ICompeticionService {

    private List<Equipo> listEquipos = Arrays.asList(
            new Equipo(1, "Yamaha", "Japón", Arrays.asList(
                    new Piloto(1, "Lorenzo", 30, "Español"),
                    new Piloto(2, "Rossi", 35, "Italiano")
            )),
            new Equipo(2, "Honda", "Japón", Arrays.asList(
                    new Piloto(3, "Márquez", 33, "Español"),
                    new Piloto(4, "Pedrosa", 35, "Español")
            ))
    );


    //i. Ver todos los equipos inscritos en la competencia
    @Override
    public List<Equipo> getTeams() {
        System.out.println(listEquipos);
        return listEquipos;
    }

    // ii. Ver todos los pilotos registrados en la competencia

    @Override
    public List<String> getAllPilotos() {
        return listEquipos.stream()
                .flatMap(equipo -> equipo.getList_piloto().stream())
                .map(Piloto::getNombre)
                .collect(Collectors.toList());
    }

    // iii. Obtener un equipo en particular

    @Override
    public Equipo buscarPorId(Integer id) {
        return listEquipos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .get();
    }

    //iv. Obtener todos los pilotos que formen parte de un equipo en específico
    @Override
    public List<PilotoDTO> getDriverCompetition(Integer id) {
        Equipo equipo = listEquipos.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
        List<PilotoDTO> listPilotos = new ArrayList<>();
        if (equipo != null){
            for( Piloto piloto : equipo.getList_piloto()){
                PilotoDTO pilDTO = new PilotoDTO();
                pilDTO.setNombre_equipo(equipo.getNombre());
                pilDTO.setNombre_piloto(piloto.getNombre());
                listPilotos.add(pilDTO);
            }
        }
        return listPilotos;
    }

}
