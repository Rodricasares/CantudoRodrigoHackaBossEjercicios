/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia2ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Cantudo
 */
public class Dia2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base;
        double altura;

        Scanner scn = new Scanner(System.in);

        System.out.print("Bienvenidos, a calcular el área de un triángulo  " + "\n");
        System.out.print("Ingrese la longitud de la base:");
        base = scn.nextDouble();
        System.out.print("Ingrese la longitud de la altura:");
        altura = scn.nextDouble();

        //Hacer el calculo de las operaciones con double 
        double result = (base * altura) / 2;

        System.out.println("El área del triángulo es : " + result);
        scn.close();
    }

}
