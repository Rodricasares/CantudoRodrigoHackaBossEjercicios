/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia7ejercicio1.models;

/**
 *
 * @author rodri
 */
public class Furgona extends Auto{
        private int asientos;

    public Furgona() {
    }

    public Furgona(int asientos) {
        this.asientos = asientos;
    }

    public Furgona(int asientos, String modelo, String marca, int anio, Double precio) {
        super(modelo, marca, anio, precio);
        this.asientos = asientos;
    }

 
    

}
