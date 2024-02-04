package com.alumno.curso.service;

import com.alumno.curso.model.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AlumnosServicios implements IAlumnos {
    List<Alumno> alumno = new ArrayList<>();

    //Crear alumno
    @Override
    public String addAlumn(Alumno addAlumno) {
        alumno.add(addAlumno);
        return null;
    }

    //Listar Alumnos
    @Override
    public List<Alumno> getAll() {
        return alumno;
    }


//Obtener Alumno por Id:

    @Override
    public Alumno getAlumnId(Long id) {
        return alumno.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .get();
    }


    @Override
    public List<Alumno> getAlumnNivel(String nivel) {
        return alumno.stream()
                .filter(al -> al.getNivel().equals(nivel))
                .collect(Collectors.toList());
    }

}
