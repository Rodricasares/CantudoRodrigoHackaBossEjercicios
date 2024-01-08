/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dia7ejercicio1;

import com.mycompany.dia7ejercicio1.models.Camioneta;
import com.mycompany.dia7ejercicio1.models.Coche;
import com.mycompany.dia7ejercicio1.models.Furgona;
import com.mycompany.dia7ejercicio1.models.InventarioAutos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Dia7Ejercicio1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        InventarioAutos<Coche> invCoche = new InventarioAutos();
        InventarioAutos<Furgona> invFurgona = new InventarioAutos();
        InventarioAutos<Camioneta> invCamioneta = new InventarioAutos();

        Coche coche0 = new Coche(3, "Astra", "Opel", 2023, 20.000);
        Coche coche1 = new Coche(5, "A5", "Audi", 2023, 40.000);

        Furgona furgona0 = new Furgona(9, "Benz", "Mercedes", 2021, 50.000);
        Furgona furgona1 = new Furgona(7, "California", "volkswagen", 2021, 45.000);

        Camioneta camion0 = new Camioneta("Diesel-Normal", "Pegaso", "Ebro", 1998, 10.000);
        Camioneta camion1 = new Camioneta("Diesel-Agricola", "Modelo-2", "Mercedes", 2021, 100.000);

        // Agregar al inventarios
        invCoche.agregarAuto(coche0);
        invCoche.agregarAuto(coche1);
        invFurgona.agregarAuto(furgona0);
        invFurgona.agregarAuto(furgona1);
        invCamioneta.agregarAuto(camion0);
        invCamioneta.agregarAuto(camion1);

        //Mostrar invetario 
        invCoche.mostrarInventario();
        invFurgona.mostrarInventario();
        invCamioneta.mostrarInventario();

        //Mostrar por el año de fabricación
        System.out.println("inserte el año que deseas consultar de la tabla Auto: ");
        int anio = scn.nextInt();
        invCoche.mostrarAutoAnio(anio);
        invFurgona.mostrarAutoAnio(anio);
        invCamioneta.mostrarAutoAnio(anio);

        //Mostrar El total de Todos los inventarios
        System.out.println("Total inventario coches");
        double totalCoche = invCoche.totalInventario();

        System.out.println("Total inventario furgonas");
        double totalFurgona = invFurgona.totalInventario();

        System.out.println("Total inventario camionetas");
        double totalCamioneta = invCamioneta.totalInventario();

        double totalGeneral = totalCoche + totalFurgona + totalCamioneta;

        System.out.println("Total de todos (Coche, Furgona & Camioneta) los inventarios: " + totalGeneral + " €");

    }
}
