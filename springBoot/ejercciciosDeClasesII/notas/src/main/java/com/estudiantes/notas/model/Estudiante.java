package com.estudiantes.notas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor

public class Estudiante {

    private Long id;
    private Integer numMatricula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private List<Calificacion> calificaciones;



}
