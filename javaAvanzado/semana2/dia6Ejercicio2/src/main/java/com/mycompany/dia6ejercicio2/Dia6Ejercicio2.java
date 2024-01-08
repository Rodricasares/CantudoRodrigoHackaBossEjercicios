/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dia6ejercicio2;

/**
 *
 * @author rodri
 */
import com.mycompany.dia6ejercicio2.models.Eventos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author rodri
 */
public class Dia6Ejercicio2 {

    public static void main(String[] args) {

        List<Eventos> event = Arrays.asList(
                new Eventos("Html & Css", "Reunion", "Sala1", LocalDate.of(2024, 5, 13)),
                new Eventos("React", "Taller", "Sala3", LocalDate.of(2024, 5, 1)),
                new Eventos("Java", "Conferencia", "Sala2", LocalDate.of(2024, 2, 13)),
                new Eventos("JavaScript", "Reunion", "Sala3", LocalDate.of(2024, 2, 12)),
                new Eventos("Sql", "Taller", "Sala3", LocalDate.of(2024, 3, 3)),
                new Eventos("Python", "Taller", "Sala4", LocalDate.of(2024, 3, 4))
        );
//
//Filtra los eventos que están programados para una fecha específica.

        LocalDate fechaAfiltrar = LocalDate.of(2024, 2, 12);

        Optional<String> filterEvents = event.stream()
                .filter(evento -> fechaAfiltrar.equals(evento.getFecha()))
                .map(evento -> "\n Curso: " + evento.getNombre())
                .reduce(String::concat);
    System.out.println("*************************************************");
        System.out.println("Evento/s del día: " + fechaAfiltrar + filterEvents.orElse(" No hay eventos en esta fecha."));
    System.out.println("*************************************************");
////Filtrar eventos por categoria Taller
        List<Eventos> categoryEvents = event.stream()
                .filter(evento -> "Taller".equals(evento.getEvento()))
                .collect(Collectors.toList());

        categoryEvents.forEach(System.out::println);

//Contar cantidad de cursos de la categoria Taller de eventos con concat()
        long countEvents = event.stream()
                .filter(evento -> evento.getEvento().equals("Taller"))
                .count();
        System.out.println("Cursos de la categoria Taller:" + countEvents);

        System.out.println("*************************************************");
        ////Filtrar eventos por categoria Reunion
        List<Eventos> categoryReunion = event.stream()
                .filter(evento -> "Reunion".equals(evento.getEvento()))
                .collect(Collectors.toList());

        categoryReunion.forEach(System.out::println);

//Contar cantidad de cursos de la categoria Reunion de eventos con concat()
        long countReunion = event.stream()
                .filter(evento -> evento.getEvento().equals("Reunion"))
                .count();
        System.out.println("Cursos de la categoria Reunion:" + countReunion);
        System.out.println("*************************************************");

        ////Filtrar eventos por categoria Reunion
        List<Eventos> categoryConferencia = event.stream()
                .filter(evento -> "Conferencia".equals(evento.getEvento()))
                .collect(Collectors.toList());

       categoryConferencia.forEach(System.out::println);

//Contar cantidad de cursos de la categoria Reunion de eventos con concat()
        long countConferencia = event.stream()
                .filter(evento -> evento.getEvento().equals("Conferencia"))
                .count();
        System.out.println("Cursos de la categoria Conferencia:" + countConferencia);
        System.out.println("*************************************************");

//filtrar el evento de la fecha mas proxima.
        LocalDate fechaActual = LocalDate.now();

        Optional<String> eventoMasCercano = event.stream()
                .filter(evento -> evento.getFecha().isAfter(fechaActual))
                .min((evento1, evento2) -> evento1.getFecha().compareTo(evento2.getFecha()))
                .map(evento -> "\n Curso: " + evento.getNombre() + " " + evento.getFecha());
    System.out.println("*************************************************");
        System.out.println("El evento más cercano a la fecha actual: " + fechaActual + eventoMasCercano.orElse("No hay eventos próximos"));
    System.out.println("*************************************************");
    }

}

//Imagina que estás construyendo una aplicación para gestionar eventos en una agenda.
//Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones utilizando Streams y Optionals:
//Filtra los eventos que están programados para una fecha específica.
//Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
//Encuentra el evento más próximo en el tiempo utilizando Optionals. 
