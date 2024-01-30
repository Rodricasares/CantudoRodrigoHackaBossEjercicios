package com.ejemplomulticapa.service;

import com.ejemplomulticapa.model.Alumno;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AlumnoService implements IAlumnoService {


    List<Alumno> alumnos = new ArrayList<>();

    @Override
    public void crearAlumno(Alumno alu) {
        //lógica de creación
        alumnos.add(alu);


    }

    @Override
    public List<Alumno> obtenerAlumnos() {
     return alumnos;
}

    //métodos de lógica de negocio


}
