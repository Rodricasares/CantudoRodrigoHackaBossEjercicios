package com.dia3Ejercicio1.RequestBody.controller;

import com.dia3Ejercicio1.RequestBody.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

@GetMapping
public String Product(){
    return "Producto creado:";

}

    @PostMapping("/product")
    public  String addProduct(@RequestBody Product newProduct){
        return "Producto creado: " + " Nombre: " + newProduct.getNombre() + " Precio: " + newProduct.getPrecio() + " Descripción: " + newProduct.getDecripcion();

    }

}
