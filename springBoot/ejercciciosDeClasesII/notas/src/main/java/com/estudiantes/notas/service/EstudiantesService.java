package com.estudiantes.notas.service;

import com.estudiantes.notas.model.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class EstudiantesService {

    List<Estudiante> listAlumnos = new ArrayList<>();


    @Override
    public String createAlumn(Estudiante alumno){
        listAlumnos.add(alumno);
        return "El alumno fue registrado con exito: "+alumno.getNombre();
    }


}
