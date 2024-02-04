package com.celiacos.platos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
public class Ingrediente {

    private Long id;
    private String nombre_ingrediente;
    private Boolean apto_celiaco;
}
