package com.inmueble.inmueble.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class Inquilino {
    private Long id_inquilino;
    private String dni;
    private String nombre;
    private String apellido;
    private String profesion;


}
