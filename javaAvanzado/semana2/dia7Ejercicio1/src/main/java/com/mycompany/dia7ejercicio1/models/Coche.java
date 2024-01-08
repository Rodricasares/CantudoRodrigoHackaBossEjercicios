/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia7ejercicio1.models;

/**
 *
 * @author rodri
 */
public class Coche extends Auto{
    private int puertas;

    public Coche() {
    }

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public Coche(int puertas, String modelo, String marca, int anio, Double precio) {
        super(modelo, marca, anio, precio);
        this.puertas = puertas;
    }
    
    
    
}
