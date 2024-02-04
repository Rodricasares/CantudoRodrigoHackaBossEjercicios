package com.estudiantes.notas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {

    private Long id;
    private Double numMatricula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private List<Calificacion> listCalificaciones;



}
