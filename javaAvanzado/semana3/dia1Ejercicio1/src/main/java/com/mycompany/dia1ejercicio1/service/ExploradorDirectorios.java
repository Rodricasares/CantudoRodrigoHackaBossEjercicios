/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia1ejercicio1.service;

import com.mycompany.dia1ejercicio1.models.Directorios;
import java.util.List;

public class ExploradorDirectorios {

    public static void explorarDirectorioRecursivo(Directorios directorio, int nivel) {
        // System.out.println("Explorando directorio: \n" + directorio.getNombre());
        StringBuilder espacio = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            espacio.append("  "); // Espacio para mostrar la jerarquía
        }
        System.out.println(espacio + directorio.getNombre() + "/");
        for (Object archivo : directorio.getArchivos()) {
            System.out.println(espacio + "|-" + archivo);
        }

        for (Object subdirectorio : directorio.getSubdirectorios()) {
            explorarDirectorioRecursivo((Directorios) subdirectorio, nivel + 1);
        }

    }

}
