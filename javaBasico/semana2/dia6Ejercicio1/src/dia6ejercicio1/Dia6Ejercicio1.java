/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia6ejercicio1;

import dia6ejercicio1.Models.Animal;
import dia6ejercicio1.Models.Ave;
import dia6ejercicio1.Models.Mamifero;
import dia6ejercicio1.Models.Reptil;

/**
 *
 * @author Rodri
 */
public class Dia6Ejercicio1 {

//    a) Crear sus clases hijas que compartan sus atributos y métodos:
//
//"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
//
//"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
//
//"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
    public static void main(String[] args) {
        // TODO code application logic here
//d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… 
        Animal saludoDesdeAnimal = new Animal(0, "Michifu", 2, "Negro", "Pescado");

// b)  Una vez creadas las clases, crear los siguientes métodos:
//
//"Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
//
//"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
//
//"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".       
        Ave gorrion = new Ave(0, "Piolín", 9, "Amarilla", "Gatos");
        Mamifero ballena = new Mamifero(0, "Ballena", 5, "Azul", "Plancton");
        Reptil lagartija = new Reptil(0, "Juancho", 1, "Verde", "Moscas");

        //c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.
        String saludoAve = gorrion.saludoAnimal();
        String saludoMamifero = ballena.saludoAnimal();
        String saludoReptil = lagartija.saludoAnimal();

        System.out.println("Desde la clase Mamífero pasando por la clase Animal -> " + saludoMamifero);
        System.out.println("Desde la clase Ave pasando por la clase Animal -> " + saludoAve);
        System.out.println("Desde la clase Reptil pasando por la clase Animal -> " + saludoReptil);

//
//d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… (Linea 30 / )
        Animal pruebaAnimal = ballena;

//¿Qué sucede? 
        System.out.println("Desde la clase Reptil pasando por la clase Animal -> " + pruebaAnimal);
//¿Es posible hacer esto? 
//Los valores relacionados con la clase madre salen null, al no tener el "atributo" super de la clase principal.
//¿Se aplica alguna propiedad para esto?
// Si en el ejercicio siguiente deberemos asignar el poliformisco, el cual agregaremos el atributo super a las clases hijas y asín poder utilizar sus valores de la clase madre

    }
}
