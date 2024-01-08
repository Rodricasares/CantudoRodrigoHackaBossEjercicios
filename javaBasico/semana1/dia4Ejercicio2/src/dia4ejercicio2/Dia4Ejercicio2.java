/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia4ejercicio2;

import dia4ejercicio2.modelos.Persona;
import java.util.Scanner;

/**
 *
 * @author minero
 */
public class Dia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        //a) Crear un vector de tipo Persona cinco posiciones.
        //   Crear cinco personas y guardarlas en él.
        Persona[] usuarios = new Persona[5];

        usuarios[0] = new Persona(0, "Mario", 7, "C/Manlva nº1", 666666666);
        usuarios[1] = new Persona(1, "Dani", 3, "C/Manlva nº6", 866888999);
        usuarios[2] = new Persona(2, "Rodri", 37, "C/Castillo nº5", 766666666);
        usuarios[3] = new Persona(3, "Rosario", 31, "C/Bajo nº11", 666644444);
        usuarios[4] = new Persona(4, "Mario", 7, "C/Alto nº16", 664664444);

        Persona user0 = usuarios[0];
        Persona user1 = usuarios[1];
        Persona user2 = usuarios[2];
        Persona user3 = usuarios[3];
        Persona user4 = usuarios[4];

        //b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de
        //   cada persona almacenada.
        for (int i = 0; i < usuarios.length; i++) {
            Persona usuario = usuarios[i];
            System.out.println("Nombre: " + usuario.getNombre() + " Edad:" + usuario.getEdad());

        }
        //c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, 
        //   realizar el cambio y luego mostrar el después de los datos de las dos 
        //   personas cuyos nombres fueron cambiados.

        System.out.println("\nUsted va a cambiar el nombre de estos dos usuarios:"
                + " \n ·" + user3.getNombre() + "\n ·" + user4.getNombre());

        user3.setNombre("Paco");
        user4.setNombre("Ana");

        System.out.println("\nUsted  a cambiado los nombres con exito:"
                + " \n ·" + user3.getNombre() + "\n ·" + user4.getNombre());

        //Imprimo el vector con los cambios asignados.
        if (user3.getNombre() == user3.getNombre()) {

            for (int i = 0; i < usuarios.length; i++) {
                Persona usuario = usuarios[i];
                System.out.println("Nombre: " + usuario.getNombre() + " Edad:" + usuario.getEdad());

            }

        }

        //d) Recorrer el vector y mostrar por pantalla únicamente a las personas
        //   cuya edad sea mayor de 30 años.
        for (int i = 0; i < usuarios.length; i++) {
            Persona usuario = usuarios[i];
            if (usuario.getEdad() >= 30) {
                System.out.println("\nLos usuarios mayores de 30 años son:"
                        + "\nNombre: " + usuario.getNombre() + " Edad:" + usuario.getEdad());

            }
        }

    }
}
