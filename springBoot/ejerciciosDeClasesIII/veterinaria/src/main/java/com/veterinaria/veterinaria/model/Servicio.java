package com.veterinaria.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Servicio {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private int numeroServ;
    private String servicio1;
    private String servicio2;
    private String servicio3;

}
