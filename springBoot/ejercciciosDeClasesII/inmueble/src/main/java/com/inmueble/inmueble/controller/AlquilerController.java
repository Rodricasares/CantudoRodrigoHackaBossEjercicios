package com.inmueble.inmueble.controller;

import com.inmueble.inmueble.dto.PropiedaDTO;
import com.inmueble.inmueble.model.Inquilino;
import com.inmueble.inmueble.model.Propiedad;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlquilerController {
    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedaDTO devolverPropiedad(@PathVariable Long id) {

        Inquilino inqui = new Inquilino(1L, "77447744A", "Walter", "White", "Profesor");
        Propiedad prop = new Propiedad(152365L, "Casa", "C/Castillo nº27", 200.0, 400000.0);
        PropiedaDTO propiDTO = new PropiedaDTO();


        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        propiDTO.setNombre_inquilino(inqui.getNombre());
        propiDTO.setApellido_inquilino(inqui.getApellido());
        return propiDTO;

    }


}
