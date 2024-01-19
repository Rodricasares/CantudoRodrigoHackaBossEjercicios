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
    
    ControladoraPersistencia control = new ControladoraPersistencia();
   
    //COmtrolEquipo
    public void createEquipo(String equipoNew) {
        control.addEquipo(new Equipo(equipoNew));
    }
    
    public List<Equipo> listarEquipos() {
        return control.listaEquipo();
    }

    //Obtenemos equipo por el id para seleccionar equipo por id al crear partidos en el servlet -> SvPArtidos
    public Equipo obtenerEquipo(int id) {
        return control.equipoId(id);
    }
    
    public void borrarEquipo(int idEliminar) {
        control.elimIdEqu(idEliminar);
    }

    //COmtrolPartido
    public void createPartido(LocalDate fecha, int puntoLocal, int puntoVisitante, Equipo local, Equipo visitante) {
        
        control.addPartido(new Partido(fecha, puntoLocal, puntoVisitante, local, visitante));
        
    }
    
    public List<Partido> listarPartidos() {
        return control.listaPartido();
    }
    
    public void borrarPartido(int idEliminar) {
        control.elimIdPart(idEliminar);
    }



    public void editEquipo(String nombre,Equipo equipo){
        //modificación en la LÓGICA
        equipo.setNombre(nombre);
        control.modificarEquipo(equipo);
         System.out.println("Metodo edit");
    }

    
}
