/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia1ejercicio1.models;

import java.util.List;

/**
 *
 * @author rodri
 */
public class Directorios <M>{

    int id;
    String nombre;
    List<Directorios> subdirectorios;
    List<String> archivos;

    public Directorios() {
    }

    public Directorios(int id, String nombre, List<Directorios> subdirectorios, List<String> archivos) {
        this.id = id;
        this.nombre = nombre;
        this.subdirectorios = subdirectorios;
        this.archivos = archivos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorios> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorios> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    
}
//Puedes utilizar una clase Directorio para cada una de las carpetas/directorios que contenga como datos: id, nombre, listaSubdirectorios, listaArchivos
