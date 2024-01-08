/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia7ejercicio1.models;

import java.util.ArrayList;

/**
 *
 * @author minero
 */
public class Camioneta extends Vehiculo implements Combustion{
     
    
     private int conbustion;
     private int capacidadTanque;
     private int consumoCombustible;

    public Camioneta(int conbustion, int capacidadTanque, int consumoCombustible, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.conbustion = conbustion;
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getConbustion() {
        return conbustion;
    }

    public void setConbustion(int conbustion) {
        this.conbustion = conbustion;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
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
        return "Camioneta: "+ super.toString() + "\nconbustion=" + conbustion + "\nCapacidad Tanque=" + capacidadTanque + "\nConsumo combustible=" + consumoCombustible ;
    }

    @Override
    public void antiguo() {
        System.out.println("La fabricacion de la camioneta es del año: " + anio);
    }

    @Override
    public void recargaCombustible() {
           System.out.println("El tipo de recarga que están haciendo es de combustion "+ "\nCombustión: "+ conbustion );
           System.out.println("Su capacidad de carburante es: " + capacidadTanque +" Litros");
           System.out.println("Su consumo a 100 Km/hs. es: " + consumoCombustible+" L.");

    }


     
}


//d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.