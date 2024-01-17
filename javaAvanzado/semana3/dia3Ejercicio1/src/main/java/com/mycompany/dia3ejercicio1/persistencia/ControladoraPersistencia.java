/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia3ejercicio1.persistencia;

import com.mycompany.dia3ejercicio1.logica.Equipo;
import com.mycompany.dia3ejercicio1.logica.Partido;
import java.util.List;

public class ControladoraPersistencia {

    EquipoJpaController equipoJpa = new EquipoJpaController();
    PartidoJpaController partidoJpa = new PartidoJpaController();

    //Crear equipo
 
    public void addEquipo(Equipo equipo) {
     equipoJpa.create(equipo);
    }

    //Listar equipos
    public List<Equipo> listaEquipo() {
        return equipoJpa.findEquipoEntities();
    }

    // Partido JPA 
    
    //Crear partido 
    public void addPartido(Partido partido) {

        partidoJpa.create(partido);

    }
    //Listar partidos

    public List<Partido> listaPartido() {
        return partidoJpa.findPartidoEntities();

    }
    
    public Equipo equipoId(int id){
   return equipoJpa.findEquipo(id);
    
    }


}
