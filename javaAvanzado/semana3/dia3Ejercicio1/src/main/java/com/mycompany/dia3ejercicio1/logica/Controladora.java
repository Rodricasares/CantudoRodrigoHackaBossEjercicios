/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia3ejercicio1.logica;

import com.mycompany.dia3ejercicio1.logica.Equipo;
import com.mycompany.dia3ejercicio1.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author rodri
 */
public class Controladora {

    ControladoraPersistencia controlEquipo = new ControladoraPersistencia();
    ControladoraPersistencia controlPartido = new ControladoraPersistencia();
    

    public void createEquipo(String equipoNew) {
        controlEquipo.addEquipo(new Equipo(equipoNew));
    }

    public List<Equipo> listarEquipos() {
        return controlEquipo.listaEquipo();
    }
    
    
    //Obtenemos equipo por el id para seleccionar equipo por id al crear partidos en el servlet -> SvPArtidos
    public Equipo obtenerEquipo(int id){
    return controlEquipo.equipoId(id);
    }
 
    
    
    public void createPartido( LocalDate fecha, int puntoLocal, int puntoVisitante, Equipo local, Equipo visitante) {

        controlPartido.addPartido(new Partido(fecha, puntoLocal, puntoVisitante, local, visitante));

    }

    public List<Partido> listarPartidos() {
    return controlPartido.listaPartido();
    }
}
