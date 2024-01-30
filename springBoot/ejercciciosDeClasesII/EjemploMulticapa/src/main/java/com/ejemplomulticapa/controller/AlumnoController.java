package com.ejemplomulticapa.controller;

import com.ejemplomulticapa.model.Alumno;
import com.ejemplomulticapa.service.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {

    private AlumnoService alumnoService =  new AlumnoService();

    public AlumnoController(){
        this.alumnoService = new AlumnoService();
    }


//Crea alumno
    @PostMapping("/alumno")
    public Alumno crearAlumno(@RequestBody Alumno alumno) {

        alumnoService.crearAlumno(alumno);
        return alumno;
    }
//Lista alumnos
    @GetMapping("/alumnos")
    public List<Alumno> obtenerAlumnos() {
        return alumnoService.obtenerAlumnos();
    }
}

