/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia7ejercicio2.models;

import java.util.List;

/**
 *
 * @author rodri
 */
public class Mascotas {
    private static int idCounter = 1;
    Integer id;
    String nombre;
    int edad;
    String especie;

    public Mascotas() {
    }

    public Mascotas(Integer id, String nombre, int edad, String especie) {
        this.id =  idCounter++;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    
    //Recuerda borrar id antes de terminar, agregaste toString en el metodo mostrarRegMascotas()
    
    @Override
    public String toString() {
        return "Mascota: " + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", especie=" + especie;
    }
    
    

}
