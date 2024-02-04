package com.estudiantes.notas.controller;

import com.estudiantes.notas.dto.CalificacionDTO;
import com.estudiantes.notas.model.Estudiante;
import com.estudiantes.notas.service.EstudiantesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/estudiante")
public class EstudiantesController {

    private EstudiantesService controller = new EstudiantesService();


    @ResponseBody
    @GetMapping("/{id}")
    public Estudiante getEstudiante(@PathVariable Long id) {
        return controller.obtenerAlumno(id);
    }

    @GetMapping("/lista-estudiantes")
    public List<Estudiante>AllEstudiantes(){
        return controller.obtenerListaAlumnos();
    }

    @GetMapping("/matricula/{matricula}")
    public Estudiante getMatricula(@PathVariable Double matricula){
        return  controller.obtetenerMatricula(matricula);
    }

    @GetMapping("/calificaciones/{id}")
    public List<CalificacionDTO>getNotas(@PathVariable Long id){
        return controller.obtenerCalificaciones(id);
    }


    @GetMapping("/notas")
    public List<String>getNotas(){
        return controller.obtenerListaPorCalificacion();
    }
}
