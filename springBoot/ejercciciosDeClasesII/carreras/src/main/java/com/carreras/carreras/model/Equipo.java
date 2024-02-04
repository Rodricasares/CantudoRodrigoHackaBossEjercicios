package com.carreras.carreras.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Equipo {

    private Integer id;
    private String nombre;
    private String pais;
    private List<Piloto>list_piloto;
}
