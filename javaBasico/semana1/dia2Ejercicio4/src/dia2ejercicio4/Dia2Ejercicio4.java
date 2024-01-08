/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia2ejercicio4;

import java.util.Scanner;

/**
 *
 * @author minero
 */
public class Dia2Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number;
        double number2;
        
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Bienvenidos a la calculadora " + "\n");
        System.out.print("Ingrese primer valor:");
        number = scn.nextDouble();
        System.out.print("Ingrese segundo valor:");
        number2 = scn.nextDouble();
       
        //Hacer el calculo de las operaciones con double siempre
        double suma = number + number2; 
        double resta = number - number2; 
        double multi = number * number2; 
        double dividir = number / number2;
        
        System.out.println("El resultado de la suma es:  " + suma  + " \n" + "El resultado de la resta es:  " + resta + "\n" + "El resultado de la multiplicación es:  " + multi + "\n" + "El resultado de la divición es:  "  + dividir  );
        scn.close();
    }
    
}
