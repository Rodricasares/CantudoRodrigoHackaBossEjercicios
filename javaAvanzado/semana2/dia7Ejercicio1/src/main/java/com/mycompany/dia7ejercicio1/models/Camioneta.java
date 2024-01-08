/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia7ejercicio1.models;

/**
 *
 * @author rodri
 */
public class Camioneta extends Auto{
    
    private String carburante;

    public Camioneta() {
    }

    public Camioneta(String carburante) {
        this.carburante = carburante;
    }

    public Camioneta(String carburante, String modelo, String marca, int anio, Double precio) {
        super(modelo, marca, anio, precio);
        this.carburante = carburante;
    }
    
    
    
}
