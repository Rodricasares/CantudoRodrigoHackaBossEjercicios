/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia7ejercicio1.models;

import java.util.ArrayList;

/**
 *
 * @RodrigoC
 */
public abstract class Vehiculo implements Electrico, Combustion {

    int id;
    String placa;
    String marca;
    String modelo;
    int anio;
    double costo;
    ////


    public Vehiculo(int id, String placa, String marca, String modelo, int anio, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Vehiculo" + "\nid=" + id + "\nplaca=" + placa + "\nmarca=" + marca + "\nmodelo=" + modelo + "\nanio=" + anio + "\ncosto=" + costo ;
    }

    //a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.
    //metodo abstracto (sín implementar)
    public abstract void antiguo();



    @Override
    public void cargaEnergia() {

        System.out.println("Carga energia");

    }

    @Override
    public void recargaCombustible() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Antigüedad: " + anio + " años");
       
      
        System.out.println("Nivel de combustible es: "  +"%");
        System.out.println();
    }

}
