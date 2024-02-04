package com.estudiantes.notas.service;

import com.estudiantes.notas.dto.CalificacionDTO;
import com.estudiantes.notas.model.Calificacion;
import com.estudiantes.notas.model.Estudiante;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EstudiantesService implements IEstudiastesService {

    private List<Estudiante> listAlumnos = Arrays.asList(
            new Estudiante(1L, 1.0, "Paco", "Mena", LocalDate.of(1991, 1, 2), Arrays.asList(
                    new Calificacion(11L, 8.0, 5.5, 5.5, 0.5))
            ),
            new Estudiante(2L, 2.0, "Ana", "Sánchez", LocalDate.of(1991, 1, 2), Arrays.asList(
                    new Calificacion(12L, 2.0, 2.5, 6.0, 4.5))
            ),
            new Estudiante(3L, 3.0, "Mario", "Zarza", LocalDate.of(1991, 1, 2), Arrays.asList(
                    new Calificacion(13L, 8.0, 9.0, 5.0, 10.0))

            ));

    //Obtener alumnos por id:
    @Override
    public Estudiante obtenerAlumno(Long id) {
        return listAlumnos.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .get();
    }

    @Override
    public List<Estudiante> obtenerListaAlumnos() {
        return listAlumnos;
    }

    //Obtener alumnos por matricula:
    @Override
    public Estudiante obtetenerMatricula(Double matricula) {
        return listAlumnos.stream()
                .filter(m -> m.getNumMatricula().equals(matricula))
                .findFirst()
                .get();
    }


    @Override
    public List<CalificacionDTO> obtenerCalificaciones(Long id) {
        Estudiante alumn = listAlumnos.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
        List<CalificacionDTO> listaCalificaciones = new ArrayList<>();
        for (Calificacion calificacion : alumn.getListCalificaciones()) {
            CalificacionDTO clfDTO = new CalificacionDTO();
            clfDTO.setNombreAlumno(alumn.getNombre());
            clfDTO.setPromedio(String.valueOf(calificacion.getPromedio()));
            listaCalificaciones.add(clfDTO);
        }
        return listaCalificaciones;
    }

    @Override
    public List<String> obtenerListaPorCalificacion() {
        return listAlumnos.stream()
                .flatMap(estudiante -> estudiante.getListCalificaciones().stream()
                        .map(calificacion -> new AbstractMap.SimpleEntry<>(
                                estudiante.getNombre() + ": " + calificacion.getPromedio(),
                                calificacion.getPromedio())))
                .sorted((entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue())) // Ordenar de mayor a menor
                .map(AbstractMap.SimpleEntry::getKey)
                .collect(Collectors.toList());
    }

}


