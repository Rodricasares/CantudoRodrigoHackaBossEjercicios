/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia7ejercicio2.models;

/**
 *
 * @author rodri
 */
public class Perros extends Mascotas{
    
   private String raza;

    public Perros() {
    }

    public Perros(String raza) {
        this.raza = raza;
    }

    public Perros(String raza, Integer id, String nombre, int edad, String especie) {
        super(id, nombre, edad, especie);
        this.raza = raza;
    }
    

    
}
