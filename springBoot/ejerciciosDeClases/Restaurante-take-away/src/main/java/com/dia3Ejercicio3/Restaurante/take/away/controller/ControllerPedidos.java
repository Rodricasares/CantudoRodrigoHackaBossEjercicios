package com.dia3Ejercicio3.Restaurante.take.away.controller;

import com.dia3Ejercicio3.Restaurante.take.away.models.Pedido;
import com.dia3Ejercicio3.Restaurante.take.away.models.Plato;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ControllerPedidos {
    private List<Plato> menu = new ArrayList<>();
    private Map<Long, Pedido> pedidos = new HashMap<>();
    private Long pedidoId = 1L;

    @PostMapping("/menu/agregar")
    public Plato agregarPlatoAlMenu(@RequestBody Plato nuevoPlato) {
        nuevoPlato.setId((long) (menu.size() + 1));
        menu.add(nuevoPlato);
        return nuevoPlato;
    }
    @GetMapping("/menu")
    public List<Plato> getMenu() {
        return menu;
    }

    @PostMapping("/pedido")
    public Pedido realizarPedido(@RequestBody List<Plato> platosPedido) {
        Pedido nuevoPedido = new Pedido(pedidoId++, platosPedido, "En preparación", "Cliente");
        pedidos.put(nuevoPedido.getId(), nuevoPedido);
        return nuevoPedido;
    }

    @GetMapping("/pedido/{id}")
    public Pedido getPedido(@PathVariable Long id) {
        return pedidos.get(id);
    }



}
