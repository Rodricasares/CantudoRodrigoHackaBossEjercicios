/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia3ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Cantudo
 */
public class Dia3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String[] semana = new String[7];
        semana[0] = "Lunes";
        semana[1] = "Martes";
        semana[2] = "Miercoles";
        semana[3] = "Jueves";
        semana[4] = "Viernes";
        semana[5] = "Sábado";
        semana[6] = "Domingo";

        double[] temperatura = new double[7];
        int suma = 0;

        System.out.println("Inserte los valores de temperatura de esta semana :");

        for (int w = 0; w < semana.length; w++) {
            System.out.println("Temperaturas del " + semana[w] + " inserte:");
            temperatura[w] = scn.nextDouble();

        }

        for (int i = 0; i < temperatura.length; i++) {
            suma += temperatura[i];
        }
        double media = (double) suma / 7;

        System.out.println("La temperatura del " + semana[0] + " es " + temperatura[0] + "º");
        System.out.println("La temperatura del " + semana[1] + " es " + temperatura[1] + "º");
        System.out.println("La temperatura del " + semana[2] + " es " + temperatura[2] + "º");
        System.out.println("La temperatura del " + semana[3] + " es " + temperatura[3] + "º");
        System.out.println("La temperatura del " + semana[4] + " es " + temperatura[4] + "º");
        System.out.println("La temperatura del " + semana[5] + " es " + temperatura[5] + "º");
        System.out.println("La temperatura del " + semana[6] + " es " + temperatura[6] + "º");
        System.out.println("La media de las temperatura de la semana es: " + media + " º");

    }

}
