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
public class Auto extends Vehiculo implements Electrico {

    private double capacidadBateria;
    private int autonomia;

    public Auto(double capacidadBateria, int autonomia, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    
    

    @Override
    public String toString() {
        return "Auto: " + super.toString() + " capacidadBateria=" + capacidadBateria + ", autonomia=" + autonomia;
    }

    @Override
    public void antiguo() {
        System.out.println("La fabricacion del auto es del año: " + anio);
    }

    @Override
    public void cargaEnergia() {
        System.out.println("El tipo de recarga que están haciendo es de energia eléctrica "+ "\nCapacidad: "+ capacidadBateria +" mah" + "\nAutonomia: " + autonomia +" hs." );
    }

    
}


//
//c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
