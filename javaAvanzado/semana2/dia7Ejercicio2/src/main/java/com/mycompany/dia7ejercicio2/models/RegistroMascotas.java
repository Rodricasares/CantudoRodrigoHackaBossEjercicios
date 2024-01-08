/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia7ejercicio2.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rodri
 */
public class RegistroMascotas<T extends Mascotas> {

    private static int idCounter = 0;
    private List<T> mascotas;

    //Guarda inventario
    public RegistroMascotas() {
        this.mascotas = new ArrayList<>();
    }

    //Agregar auto nuevo
    public void agregarMascota(T mascota) {
        mascotas.add(mascota);
        System.out.println("Mascota agregada al registro: " + "Id: " + mascota.id + " Nombre: " + mascota.nombre + " Especie: " + mascota.getEspecie() + " Edad: " + mascota.getEdad());
    }

    //Mostrar 
    public void mostrarRegMascotas() {
        System.out.println("Inventario:");
        for (T mascota : mascotas) {
            System.out.println("Mascota agregada al registro: " + mascota.id + toString());
        }
    }

    //Buscar Mascotas por Nombre o Especie:
    public List<T> mostrarNombre(String nombre) {
        mascotas.stream()
                .filter(mascota -> mascota.nombre.equalsIgnoreCase(nombre))
                .forEach(System.out::println);
        return null;
    }

    public List<T> mostrarEspecie(String especie) {
        mascotas.stream()
                .filter(mascota -> mascota.especie.equalsIgnoreCase(especie))
                .forEach(System.out::println);
        return null;
    }

    //Contar  .... Parece no funcionarme bien !!! MMMMM Lo dejo un poco feo ó sucio como deseen llamar para que me expliquen el porque de mis errores.Gracias-
    public void totalMascotas() {
        //Los compañeros lo hicieron con.size()
        System.out.println("El numero de mascotas registradas es de: " + mascotas.size());

        //double total  = mascotas.stream()
        //.map(Mascotas::getId) // Obtener los IDs de las mascotas
        //.filter(id -> id != null) // Filtrar IDs no nulos (ajusta según tu implementación)
        //.count();
//                .mapToDouble(Mascotas::getId)
//                .sum();
//        System.out.println("Número de mascotas registradas es: " + total);
//        return 0;
    }

    //Generas Mascotas aleatoriamente
    public static Mascotas datosAleatorios() {
        Random rand = new Random();

        String[] nombres = {"Balú", "Firulais", "Boby", "Sheina", "Dollar", "Canelo"};
        String[] especies = {"Ave", "Gato", "Perro"};
        int idAleatorio = idCounter++; // Asignar un ID único
        String nombreAleatorio = nombres[rand.nextInt(nombres.length)];
        int edadAleatoria = rand.nextInt(15) + 1;
        String especieAleatoria = especies[rand.nextInt(especies.length)];

        return new Mascotas(idAleatorio, nombreAleatorio, edadAleatoria, especieAleatoria);
    }
    // Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util 
    //para generar datos aleatorios, como nombres, edades o especies, 
    //para agregar mascotas al registro.
////
}
