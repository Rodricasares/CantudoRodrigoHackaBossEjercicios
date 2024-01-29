package com.hackAboss.company.model;

import java.util.List;

public class Empresa {
    private Long id;
    private String nombre;
    private List<Empleado> empleados;


    public Empresa() {
    }


    public Empresa(Long id, String nombre, List<Empleado> empleados) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}

