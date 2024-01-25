package com.ejercicio3Dia2.searchProduct.controller;

import models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

@RestController
public class ControlProduct {

    List<Product> listProducto = Arrays.asList(
            new Product(1, "Agua"),
            new Product(2, "Café"),
            new Product(3, "Lechugas")
    );


    @GetMapping("/product/{id}")
    public String obtenerProduct(@PathVariable Integer id) {
        return listProducto.stream()
                .filter(product -> product.getId().equals(id))
                .map(product -> product.getName())
                .findFirst()
                .orElse("No se encontro el producto");

    }
}
