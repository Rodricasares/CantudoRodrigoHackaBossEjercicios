/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia7ejercicio1.models;

/**
 *
 * @author rodri
 */
public class Auto {

    private String modelo;
    private String marca;
    private int anio;
    private Double precio;
               
            public Auto() {
    }

    public Auto(String modelo, String marca, int anio, Double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo + ", marca=" + marca + ", anio=" + anio + ", precio=" + precio + '}';
    }

}
//Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. 
//Crea una clase Auto con atributos como marca, modelo, año, y precio.
//Implementa una clase utilitaria InventarioAutos con métodos genéricos para 
//realizar las siguientes operaciones:
