package com.alumno.curso.service;

import com.alumno.curso.model.Alumno;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

public interface IAlumnos {

//crear alumno interfas
    public String addAlumn(Alumno addAlumno);

//Listar alumnos
    List<Alumno> getAll();

//Obtener Alumno por Id:

    @GetMapping("/{id}")
    Alumno getAlumnId(Long id);


//Obtener alumno por nivel estudios
    List<Alumno> getAlumnNivel(String nivel);



}
