package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.dto.PacienteDTO;
import com.veterinaria.veterinaria.model.Paciente;
import com.veterinaria.veterinaria.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private IPacienteService personaServ;

    @GetMapping("/traer")
    public List<Paciente> getPersonas() {
        return personaServ.getPersonas();
    }

    @PostMapping("/crear")
    public String savePersona(@RequestBody Paciente perso) {
        personaServ.savePersona(perso);
        return "Animal creado correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        personaServ.deletePersona(id);
        return "Animal eliminado correctamente";
    }

    //para hacer un "update" (edición) Hibernate no cuenta con un método específico
    // (como si lo hacía Eclipselink). Por lo que es necesario, buscar la persona
    // a editar, setear sus nuevos valores a nivel lógico y luego enviarlos a la BD
    // mediante el método Save. Recordemos que save es "guardar" por lo que sirve
    // tanto para altas como para modificaciones ya que "guarda" los datos.

    @PutMapping("/editar/{id}")
    public Paciente editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nombreModif,
                               @RequestParam("tipo") String tipoModif,
                               @RequestParam("cita") int citaModif) {

//buscamos la persona en cuestión
        Paciente perso = personaServ.findPersona(id);

        perso.setNombre(nombreModif);
        perso.setTipo(tipoModif);
        perso.setCita(citaModif);

        personaServ.savePersona(perso);

        return perso;
    }






}

