/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia7ejercicio1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author rodri
 */
public class InventarioAutos<T extends Auto> {

    private List<T> automoviles;

    //Guarda inventario
    public InventarioAutos() {
        this.automoviles = new ArrayList<>();
    }
    //Agregar auto nuevo

    public void agregarAuto(T auto) {
        automoviles.add(auto);
        System.out.println("Producto agregado al inventario: " + auto.getMarca() + " " + auto.getModelo());
    }

    //Mostrar 
    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (T auto : automoviles) {
            System.out.println("Marca: " + auto.getMarca() + " Modelo: " + auto.getModelo() + " Precio: " + auto.getPrecio() + " €");
        }
    }
        public double totalInventario() {
        //System.out.println("La cantidad del total de los precios del inventario:");
        double total = automoviles.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();

        System.out.println( total);
        return total;
    }
    
    
    //Mostrar autos por año

    public List<T> mostrarAutoAnio(int anio) {
        automoviles.stream()
                .filter(auto -> auto.getAnio() == anio)
                .forEach(System.out::println);
        return null;
    }



//
}
