package com.estudiantes.notas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Calificacion {
    private Long id;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;
}
