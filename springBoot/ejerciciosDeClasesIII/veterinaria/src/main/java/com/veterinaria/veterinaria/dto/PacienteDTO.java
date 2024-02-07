package com.veterinaria.veterinaria.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PacienteDTO {
    private Long id;
    private String nombreAnimal;
    private String tipoAnimal;
    private int citaAnimal;
}
