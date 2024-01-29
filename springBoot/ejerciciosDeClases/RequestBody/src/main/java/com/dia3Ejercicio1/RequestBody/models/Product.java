package com.dia3Ejercicio1.RequestBody.models;

public class Product {

    private Integer id;
    private String nombre;
    private  Double precio;
    private String decripcion;


    public Product() {
    }

    public Product(Integer id, String nombre, Double precio, String decripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.decripcion = decripcion;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }
}
