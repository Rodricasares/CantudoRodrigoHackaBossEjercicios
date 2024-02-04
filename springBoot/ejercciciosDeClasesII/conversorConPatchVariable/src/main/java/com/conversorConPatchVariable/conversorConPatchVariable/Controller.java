package com.conversorConPatchVariable.conversorConPatchVariable;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String conversorAmetros() {
        return "Home page";
    }

    @GetMapping("/convert/{num}")
    public String conversorAmetros(@PathVariable int num) {

        double divisor = 0.010;
        double operacion = num * divisor;
        return "El numero "+ num +" convertido a metros es: " + operacion +" metro/s";
    }


}
