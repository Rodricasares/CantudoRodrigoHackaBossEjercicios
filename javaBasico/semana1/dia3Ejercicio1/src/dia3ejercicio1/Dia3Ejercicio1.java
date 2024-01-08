/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Cantudo
 */
public class Dia3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scn = new Scanner(System.in);

        int edad = 18;

        System.out.println("Bienvenidos al recital hack a boss, \n la entrada en para mayores de edad, \n ingrese su la edad:");
        edad = scn.nextInt();

        if (edad >= 18) {
            System.out.println("Disfrute del evento !!!");

        } else {

            System.out.println("Lo sentimos, este recital es para mayores de edad. ");
        }

    }
}
