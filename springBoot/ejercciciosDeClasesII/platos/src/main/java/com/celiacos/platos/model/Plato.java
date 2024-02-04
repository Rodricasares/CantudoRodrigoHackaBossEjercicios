package com.celiacos.platos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Plato {


    private Long id;
    private String nombre_plato;
    private Double precio;
    private List<Ingrediente> lista_ingredientes;
}
