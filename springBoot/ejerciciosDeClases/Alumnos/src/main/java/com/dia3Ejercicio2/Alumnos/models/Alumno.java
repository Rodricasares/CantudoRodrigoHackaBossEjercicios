package com.dia3Ejercicio2.Alumnos.models;

public class Alumno {
private Integer id;
private  String nombre;
private  Double numeroMatricula;

private Double nota;
private String nivel;


    public Alumno() {
    }

    public Alumno(Integer id, String nombre, Double numeroMatricula, Double nota, String nivel) {
        this.id = id;
        this.nombre = nombre;
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
        this.nivel = nivel;
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

    public Double getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Double numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
//id, nombre, apellido, numero de matrícula, nota final y nivel educativo (Primario, Secundario y Terciario).