/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia2ejercicio2.persistencia;

import com.mycompany.dia2ejercicio2.logica.Votos;
import java.util.List;

/**
 *
 * @author rodri
 */
public class ControladoraPersistencia {

    VotosJpaController votoJpa = new VotosJpaController();

    public void addVotos(Votos voto) {

        votoJpa.create(voto);

    }

    public List <Votos> listVotos() {
        return votoJpa.findVotosEntities();
    }

    public int countVotos() {
        return votoJpa.getVotosCount(); // Llamada al método existente countVotos
    }

}
