package com.celiacos.platos.controller;

import com.celiacos.platos.dto.PedidoDTO;
import com.celiacos.platos.model.Ingrediente;
import com.celiacos.platos.model.Plato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PedidoController {
    @GetMapping("/pedido/{id}")
    @ResponseBody

    public PedidoDTO devolverPedido(@PathVariable Long id) {

        List<Ingrediente> ingredientes = Arrays.asList(
                new Ingrediente(1L, "Ingrediente1",true),
                new Ingrediente(2L, "Ingrediente2",true),
                new Ingrediente(3L, "Ingrediente3",true)
        );

        List<Ingrediente> ingredientes2 = Arrays.asList(
                new Ingrediente(1L, "Ingrediente1",false),
                new Ingrediente(2L, "Ingrediente2",true),
                new Ingrediente(3L, "Ingrediente3",true)
        );

        Plato plt = new Plato(1L, "Palla", 10.0,ingredientes);
        Plato plt1 = new Plato(1L, "Palla", 10.0,ingredientes2);

        PedidoDTO pedDTO = new PedidoDTO();

        pedDTO.setId_plato(plt.getId());
        pedDTO.setNombre_plato(plt.getNombre_plato());
        pedDTO.setApto_celiacos(plt.getLista_ingredientes().stream().allMatch(Ingrediente::getApto_celiaco));
        return pedDTO;
    }
}