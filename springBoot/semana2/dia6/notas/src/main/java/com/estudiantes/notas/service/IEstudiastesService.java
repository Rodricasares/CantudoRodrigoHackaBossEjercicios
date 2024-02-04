package com.estudiantes.notas.service;

import com.estudiantes.notas.dto.CalificacionDTO;
import com.estudiantes.notas.model.Estudiante;

import java.util.List;

public interface IEstudiastesService {


    public Estudiante obtenerAlumno(Long id);

    public List<Estudiante> obtenerListaAlumnos();

    //GET /calificaciones/{num_matricula}: Devuelve las calificaciones de un determinado estudiante.
    public Estudiante obtetenerMatricula(Double matricula);

   public List<String> obtenerListaPorCalificacion();

    public List<CalificacionDTO> obtenerCalificaciones(Long id);
}
