package com.carreras.carreras.controller;

import com.carreras.carreras.dto.PilotoDTO;
import com.carreras.carreras.model.Equipo;
import com.carreras.carreras.service.CompeticionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/competicion")
public class EquipoController {


    private CompeticionService competicionService = new CompeticionService();
    @GetMapping("/{id}")
    //@ResponseBody
    public List<PilotoDTO> obtenerEquipo(@PathVariable Integer id) {
        return competicionService.getDriverCompetition(id);

    }
    @GetMapping("/equipos")

    public List<Equipo> obtenerTodosEqu() {
        return competicionService.getTeams();
    }

    @GetMapping("/pilotos")
    public List<String>obtenerPilotos(){
        return competicionService.getAllPilotos();
    }

    @GetMapping("/equipo/{id}")
    public Equipo obtenerEquipoId(@PathVariable Integer id){
        return competicionService.buscarPorId(id);
}

}