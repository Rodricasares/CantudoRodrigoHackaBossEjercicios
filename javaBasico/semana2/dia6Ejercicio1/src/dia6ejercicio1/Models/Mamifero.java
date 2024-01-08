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
public class Mamifero extends Animal {

    private int patas;
    private String reproduccion;
    private String color;
    private String habitat;

    public Mamifero(int id, String nombre, int edad, String piel, String alimentacion) {
        super(id, nombre, edad, piel, alimentacion);
        this.patas = patas;
        this.reproduccion = reproduccion;
        this.color = color;
        this.habitat = habitat;

    }

    public Mamifero() {

    }

    @Override
    public String saludoAnimal() {

        return "Hola, soy un mamífero !!!";

    }

    @Override
    public String toString() {
        return "Mamifero" + super.toString() + '{' + "patas=" + patas + ", reproduccion=" + reproduccion + ", color=" + color + ", habitat=" + habitat + '}';
    }

}
