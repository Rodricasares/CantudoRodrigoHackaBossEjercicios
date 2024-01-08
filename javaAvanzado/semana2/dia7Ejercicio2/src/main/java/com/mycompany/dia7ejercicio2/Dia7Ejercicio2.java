/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dia7ejercicio2;

import com.mycompany.dia7ejercicio2.models.Aves;
import com.mycompany.dia7ejercicio2.models.Gatos;
import com.mycompany.dia7ejercicio2.models.Mascotas;
import com.mycompany.dia7ejercicio2.models.Perros;
import com.mycompany.dia7ejercicio2.models.RegistroMascotas;
import static com.mycompany.dia7ejercicio2.models.RegistroMascotas.datosAleatorios;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Dia7Ejercicio2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("  CLINICA DE MASCOTAS  ");
        System.out.println("***********************");

        RegistroMascotas<Aves> invAves = new RegistroMascotas();
        RegistroMascotas<Gatos> invGatos = new RegistroMascotas();
        RegistroMascotas<Perros> invPerros = new RegistroMascotas();

        Aves ave = new Aves("Canario - silvestre", 0, "Piolin", 1, "Ave");
        Aves ave1 = new Aves("Loro - Amazonas", 1, "Volador", 2, "Ave");

        Gatos gato = new Gatos("Romano", 2, "Mincho", 5, "Felis");
        Gatos gato1 = new Gatos("Egipcio", 3, "Faraon", 2, "Felis");

        Perros perro = new Perros("Boxer", 4, "Lopo", 6, "Canina");
        Perros perro1 = new Perros("Pastor Aleman", 5, "Rex", 4, "Canina");

        // Agregar al inventarios
        invAves.agregarMascota(ave);
        invAves.agregarMascota(ave1);

        invGatos.agregarMascota(gato);
        invGatos.agregarMascota(gato1);

        invPerros.agregarMascota(perro);
        invPerros.agregarMascota(perro1);

        //Busqueda de Mascotas por Nombre o Especie desde registroMascotas.
        System.out.println("Seleccione el tipo de busqueda, por Nombre ó Especie:");
        System.out.println("1. Nombre");
        System.out.println("2. Especie");
        System.out.println("3. Salir");
        int opcion = scn.nextInt();
        scn.nextLine();
        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese el nombre de la Mascota:");
                String nombre = scn.nextLine().toLowerCase();

                invAves.mostrarNombre(nombre);
                invGatos.mostrarNombre(nombre);
                invPerros.mostrarNombre(nombre);
            }
            case 2 -> {
                System.out.println("Ingrese la especie de la Mascota:");
                String especie = scn.nextLine().toLowerCase();
                invAves.mostrarEspecie(especie);
                invGatos.mostrarEspecie(especie);
                invPerros.mostrarEspecie(especie);
            }

            default ->
                System.out.println("Opción no válida");
        }

        scn.close();

        //El numero de registros en base de datos Mascotas.
        invAves.totalMascotas();
        invGatos.totalMascotas();
        invPerros.totalMascotas();

        //Mostrar El total de Todos los inventarios parece no funcionar bien y el tiempo se me agoto 14.11h día 08-01-2024
//        System.out.println("Total Aves");
//        long totalAves = invAves.totalMascotas();
//
//        System.out.println("Total Gatos");
//        double totalGatos = invGatos.totalMascotas();
//
//        System.out.println("Total Perros");
//        double totalPerros = invPerros.totalMascotas();
//
//        //Total Mascotas
//        double totalGeneral = totalAves + totalGatos + totalPerros;
//        System.out.println("Total de Mascotas registradas: " + totalGeneral);
        
        
        //Genera mascota aleatoriamente
        Mascotas mascotaAleatoria = datosAleatorios();
        System.out.println("Mascota aleatoria generada: " + mascotaAleatoria);

    }
}
