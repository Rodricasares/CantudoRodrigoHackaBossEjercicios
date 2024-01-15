/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia2ejercicio2.logica;

import com.mycompany.dia2ejercicio2.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controladora = new ControladoraPersistencia();
    
    public void createVote(Votos voto) {
        controladora.addVotos(voto);
    }
    
    public List<Votos> listOfVotes(){
        return controladora.listVotos();
    }
    
}