package com.event.eventArea.model;

import java.time.LocalDate;
import java.util.Date;

public class Event {

    private Long id;
    private String titulo;
    private String descripcion;
    private LocalDate fecha;
    private Date hora;
    private String ponentes;

    public Event() {
    }

    public Event(Long id, String titulo, String descripcion, LocalDate fecha, Date hora, String ponentes) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.ponentes = ponentes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getPonentes() {
        return ponentes;
    }

    public void setPonentes(String ponentes) {
        this.ponentes = ponentes;
    }
}
