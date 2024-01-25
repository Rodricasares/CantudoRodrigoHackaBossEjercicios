package com.ejercicio1Dia2.ejercicio1Dia2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariable {
    @GetMapping("/usuarios")
    public String obtenerUsuarioPorNombre() {
        // Utiliza el nombre recibido para obtener el usuario con ese nombre
        return "Hola mundo: ";
    }
    @GetMapping("/usuarios/{name}/{age}")
    public String obtenerUsuarioPorId(@org.springframework.web.bind.annotation.PathVariable String name, @org.springframework.web.bind.annotation.PathVariable String age) {
        // Utiliza el id recibido para obtener el usuario con ese identificador
        return "Hola mundo: " + name + "con la edad: " + age ;
    }


    @GetMapping("/usuarios/{id}")
    public String obtenerUsuarioPorId(@org.springframework.web.bind.annotation.PathVariable Long id) {
        // Utiliza el id recibido para obtener el usuario con ese identificador
        return "Hola mundo: " + id;
    }


    @GetMapping("/nombre/{name}")
    public String obtenerUsuarioPorId(@org.springframework.web.bind.annotation.PathVariable String name) {
        // Utiliza el id recibido para obtener el usuario con ese identificador
        return "El nombre es: " + name ;
    }

    @GetMapping("/edad/{age}")
    public String obtenerUsuarioPorId(@org.springframework.web.bind.annotation.PathVariable Integer age) {
        // Utiliza el id recibido para obtener el usuario con ese identificador
        return "Maria tiene : " + age ;
    }

///// Ahora con @RequestParam ////////



    @GetMapping("/nombre")
    public String obtenerUsuarioPorNombre(@RequestParam String nombres) {
        // Utiliza el nombre recibido para algún propósito
        return "Hola mundo: " + nombres;
    }

    @GetMapping("/edad")
    public String obtenerUsuarioPorEdad(@RequestParam int edades) {
        // Utiliza la edad recibida para algún propósito
        return "Hola mundo: " + edades;
    }


    @GetMapping("/registro")
    public String obtenerUsuarioPorNombreYEdad(@RequestParam String name, @RequestParam String profesion, @RequestParam int age) {
        // Utiliza el nombre y la edad recibidos para algún propósito
        return "Hola mundo: " + name + " Profesion: " + profesion +" con edad de " + age;
    }
}
