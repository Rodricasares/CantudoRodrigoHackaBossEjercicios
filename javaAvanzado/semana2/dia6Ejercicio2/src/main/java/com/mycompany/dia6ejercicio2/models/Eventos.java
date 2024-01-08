/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia6ejercicio2.models;

import java.time.LocalDate;

/**
 *
 * @author rodri
 */
public class Eventos {
    String nombre;
    String evento;
    String lugar;
    LocalDate fecha;

    public Eventos() {
    }

    public Eventos(String nombre, String evento, String lugar, LocalDate fecha) {
        this.nombre = nombre;
        this.evento = evento;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Eventos: " + "nombre=" + nombre + ", evento=" + evento + ", lugar=" + lugar + ", fecha=" + fecha;
    }
    
    
    
}
