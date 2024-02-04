package com.alumno.curso.controller;

import com.alumno.curso.model.Alumno;
import com.alumno.curso.service.AlumnosServicios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {

    private AlumnosServicios alumnosSv = new AlumnosServicios();

    //Crear
    @PostMapping
    public String createAlumno(@RequestBody Alumno newAlumn) {
        return alumnosSv.addAlumn(newAlumn);
    }

    //Listar
    @GetMapping("/listar")
    public List<Alumno> obtenerTodos() {
        return alumnosSv.getAll();
    }

    //Obtener por Id
    @GetMapping("/{id}")
    public Alumno getId(Long id) {
        return alumnosSv.getAlumnId(id);
    }


//Filtrar por nivel de estudios

    @GetMapping("/nivel")
    public List<Alumno> getAlumnoNivel(@RequestParam String nivel) {
        return alumnosSv.getAlumnNivel(nivel);
    }


}
