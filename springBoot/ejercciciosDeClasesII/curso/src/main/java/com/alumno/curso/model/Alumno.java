package com.alumno.curso.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {
    private Long id;
    private String nombre;
    private String apellido;
    private Double numero;
    private Double matricula;
    private Double nota;
    private String nivel;

}
