package com.inmueble.inmueble.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter

public class PropiedaDTO implements Serializable {

    private Long id_propiedad;
    private String tipo;
    private String direccion;
    private Double valor_alquiler;
    private String nombre_inquilino;
    private String apellido_inquilino;
}
