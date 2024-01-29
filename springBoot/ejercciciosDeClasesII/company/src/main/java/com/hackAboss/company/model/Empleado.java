package com.hackAboss.company.model;
public class Empleado {
    private Long id;
    private Integer legajo;
    private String nombre;
    private String apellido;
    private Double sueldo;

    public Empleado() {
    }

    public Empleado(Long id, Integer legajo, String nombre, String apellido, Double sueldo) {
        this.id = id;
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public Long getId() {
        return id;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Double getSueldo() {
        return sueldo;
    }
}

