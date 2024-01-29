package com.hackAboss.company.controller;

import com.hackAboss.company.model.Empleado;
import com.hackAboss.company.model.Empresa;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/empresa")

public class ControllerCompany {
    private List<Empresa> listEmpresas = new ArrayList<>();


    @PostMapping
    public String agregarEmpresa(@RequestBody Empresa empresa) {
        listEmpresas.add(empresa);
        return "Agregada correctamente la empresa: " + empresa.getNombre();
    }


    @GetMapping("/listCompany")
    public List<Empresa> obtenerEmpresas() {
        return listEmpresas;
    }


    @GetMapping("/{id}")
    public Empresa buscarEmpresa(@PathVariable Long id) {
        return listEmpresas.stream()
                .filter(empresa -> empresa.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/{id}/empleados")
    public List<Empleado> obtenerEmpleados(@PathVariable Long id) {
        Empresa empresa = listEmpresas.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
        return empresa.getEmpleados();
    }


}
