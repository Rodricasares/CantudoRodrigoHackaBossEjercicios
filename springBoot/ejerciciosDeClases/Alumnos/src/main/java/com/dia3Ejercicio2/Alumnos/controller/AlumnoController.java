package com.dia3Ejercicio2.Alumnos.controller;


import com.dia3Ejercicio2.Alumnos.models.Alumno;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AlumnoController {


    @GetMapping
    public String main() {
        return "Ejercicio de  Notas de Alumnos";
    }

    List<Alumno> listAlumnos = Arrays.asList(
            new Alumno(1, "Manuel", 1.0, 8.0, "nivel2"),
            new Alumno(1, "Manuel", 1.0, 8.0, "nivel1"),
            new Alumno(2, "Paco", 2.0, 5.0, "nivel2"),
            new Alumno(3, "Maria", 1.0, 2.0, "nivel1"),
            new Alumno(4, "Rosario", 1.0, 9.0, "nivel3")
    );


    //Crear user o alumno
    @PostMapping("/alumno")
    public String addalumno(@RequestBody Alumno alumno) {
        return "Alumno creado con exito: " + alumno.getNombre();
    }


    //devolver lista
    @GetMapping("/lista-alumnos")
    public List<Alumno> listaAlumnos() {
        return listAlumnos;
    }

    //Obtener alumno por id
    @GetMapping("/alumno/{id}")
    public String obtenerAlumnoId(@PathVariable Integer id) {
        return listAlumnos.stream()
                .filter(alumn -> alumn.getId().equals(id))
                .map(alumn -> alumn.getNombre())
                .findFirst()
                .orElse("Alumno no encontrado");
    }

    @GetMapping("/alumnos/{nivel}")
    public String obtenerAlumnoId(@PathVariable String nivel) {
        return listAlumnos.stream()
                .filter(alumn -> alumn.getNivel().equals(nivel))
                .map(alumn -> alumn.getNombre() + " " + alumn.getNivel())
                .collect(Collectors.toList()).toString();
    }


}
