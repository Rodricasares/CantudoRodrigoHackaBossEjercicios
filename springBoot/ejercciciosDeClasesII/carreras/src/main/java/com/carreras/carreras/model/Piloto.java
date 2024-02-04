package com.carreras.carreras.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Piloto {

    private Integer id;
    private String nombre;
    private int edad;
    private String nacionalidad;

}
