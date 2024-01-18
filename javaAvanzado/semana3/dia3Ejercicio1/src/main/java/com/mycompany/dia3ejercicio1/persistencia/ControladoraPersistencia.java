/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia3ejercicio1.persistencia;

import com.mycompany.dia3ejercicio1.logica.Equipo;
import com.mycompany.dia3ejercicio1.logica.Partido;
import com.mycompany.dia3ejercicio1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public Equipo equipoId(int id) {
        return equipoJpa.findEquipo(id);

    }

    public void elimIdEqu(int idEliminar) {

        try {
            equipoJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void elimIdPart(int idEliminar) {

        try {
            partidoJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarEquipo(Equipo equipo) {
        try {
            equipoJpa.edit(equipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
