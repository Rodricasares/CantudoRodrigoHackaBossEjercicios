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
public class Ave extends Animal {

    private String alas;
    private String vuelo;
    private String color;
    private String pico;

    public Ave(int id, String nombre, int edad, String piel, String alimentacion) {
        super(id, nombre, edad, piel, alimentacion);
        this.alas = alas;
        this.vuelo = vuelo;
        this.color = color;
        this.pico = pico;

    }

    public Ave() {

    }

    @Override
    public String saludoAnimal() {
        return "Hola, soy un ave !!!";

    }

    @Override
    public String toString() {
        return "Ave" + super.toString() + '{' + "alas=" + alas + ", vuelo=" + vuelo + ", color=" + color + ", pico=" + pico + '}';
    }

}

//1º
//"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
//2º
//b)  Una vez creadas las clases, crear los siguientes métodos:
//
//"Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
//
//"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
//
//"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".

