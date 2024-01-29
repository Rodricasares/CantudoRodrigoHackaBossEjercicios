package com.dia3Ejercicio3.Restaurante.take.away.controller;

import com.dia3Ejercicio3.Restaurante.take.away.models.Plato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerMenu {





    @GetMapping
    public String main(){
        return "Restaurante Hack a Boss";
    }

//POST /menu/agregar: Permite agregar un nuevo plato al menú (agregar a una colección)
    @PostMapping("/add-plato")
    public String addPlato(@RequestBody Plato plato){
        return "Restaurante Hack a Boss: \n" + plato.getNombre();
    }
//•	GET /menu: Devuelve la lista completa de platos




}
