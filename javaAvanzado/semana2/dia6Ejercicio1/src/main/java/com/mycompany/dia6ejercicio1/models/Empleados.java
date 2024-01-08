/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia6ejercicio1.models;

/**
 *
 * @author rodri
 */
public class Empleados {
    
    
    String nombre;
    Double salario;
    String categoria;

    public Empleados() {
    }

    public Empleados(String nombre, Double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Empleados: " + "nombre=" + nombre + ", salario=" + salario + ", categoria=" + categoria;
    }
    
    
        
}
