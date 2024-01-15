/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dia1ejercicio1;

import com.mycompany.dia1ejercicio1.models.Directorios;
import static com.mycompany.dia1ejercicio1.service.ExploradorDirectorios.explorarDirectorioRecursivo;

import java.util.List;

public class Dia1Ejercicio1 {

    public static void main(String[] args) {

        Directorios directorioRaiz = new Directorios();
        // Establecer relaciones entre los directorios
        directorioRaiz.setSubdirectorios(List.of("Directorio 1", "SubDirectorio", "Archivo"));
       // directorioRaiz.setSubdirectorios(List.of(subdirectorio5, subdirectorio4));
       // directorioRaiz1.setSubdirectorios(List.of(subdirectorio1, subdirectorio2));
        //subdirectorio4.setSubdirectorios(List.of(subdirectorio3));
       // subdirectorio5.setSubdirectorios(List.of(archivos2, archivos1));
        // Llamar al método de exploración recursiva
        //explorarDirectorioRecursivo(subdirectorio5, 2);
        explorarDirectorioRecursivo(directorioRaiz, 0);
        
//        explorarDirectorioRecursivo(directorioRaiz1);
//        explorarDirectorioRecursivo(subdirectorio4);
//        explorarDirectorioRecursivo(subdirectorio5);
    }
}
