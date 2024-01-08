/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6ejercicio1.Models;

//b)  Una vez creadas las clases, crear los siguientes métodos:
//
//a) Crear sus clases hijas que compartan sus atributos y métodos:
//
//"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
//
//"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
//
//"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
public class Animal {

    private int id;
    private String nombre;
    private int edad;
    private String piel;
    private String alimentacion;

    public Animal(int id, String nombre, int edad, String piel, String alimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.piel = piel;
        this.alimentacion = alimentacion;
    }

    public Animal() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", piel=" + piel + ", alimentacion=" + alimentacion + '}';
    }

    public String saludoAnimal() {

        return "Saludos desde la clase madre Animal !!!";

    }

}

//#Ejercicio Nº 1 - Herencia, Polimorfismo y Encapsulamiento - Individual
//Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos y constructores correspondientes).
//Agregar también un método llamado saludar que emita un mensaje por pantalla que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:

