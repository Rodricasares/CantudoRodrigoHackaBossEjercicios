package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.model.Paciente;
import com.veterinaria.veterinaria.model.Servicio;
import com.veterinaria.veterinaria.service.IPacienteService;
import com.veterinaria.veterinaria.service.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicios")
public class ServicioController {

    @Autowired
    private IServicioService personaServ;


    @GetMapping("/traer")
    public List<Servicio> getPersonas() {
        return personaServ.getPersonas();
    }

    @PostMapping("/crear")
    public String savePersona(@RequestBody Servicio perso) {
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
    public Servicio editPersona(@PathVariable Long id,
                                @RequestParam("numeroServ") int numeroServModif,
                                @RequestParam("servicio1") String servicio1Modif,
                                @RequestParam("servicio2") String servicio2Modif,
                                @RequestParam("servicio3") String servicio3Modif

                                ) {

//buscamos la persona en cuestión
        Servicio perso = personaServ.findPersona(id);

        perso.setNumeroServ(numeroServModif);
        perso.setServicio1(servicio1Modif);
        perso.setServicio2(servicio2Modif);
        perso.setServicio3(servicio3Modif);


        personaServ.savePersona(perso);

        return perso;
    }
}
