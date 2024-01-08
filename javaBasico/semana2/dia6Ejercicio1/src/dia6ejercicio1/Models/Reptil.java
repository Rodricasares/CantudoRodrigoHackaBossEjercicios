/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6ejercicio1.Models;

//a) Crear sus clases hijas que compartan sus atributos y métodos:
//
//"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
//
//"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
//
//"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
public class Reptil extends Animal {

    private double longitud;
    private String escamas;
    private String veneno;
    private String habitat;

    public Reptil(int id, String nombre, int edad, String piel, String alimentacion) {
        super(id, nombre, edad, piel, alimentacion);

        this.longitud = longitud;
        this.escamas = escamas;
        this.veneno = veneno;
        this.habitat = habitat;

    }

    @Override
    public String saludoAnimal() {

        return "Hola, soy un reptil !!!";
    }

    public Reptil() {

    }

    @Override
    public String toString() {
        return "Reptil" + super.toString() + '{' + "longitud=" + longitud + ", escamas=" + escamas + ", veneno=" + veneno + ", habitat=" + habitat + '}';
    }

}


//"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
