/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia3ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Cantudo
 */
public class Dia3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        double precio = 0;
        String text = "exit";
        boolean bandera = false;

        System.out.println("Ingresa los precios de los productos, para finalizar la compra inserte: 0");
        while (bandera != true) {
            System.out.print("Ingresa el precios del producto: ");
            precio = scanner.nextDouble();
            System.out.print("Ingresa el nombre del producto: ");
            text = scanner.next();

            if (precio <= 0 || text.equalsIgnoreCase("exit")) {
                bandera = true;
            }

            System.out.println("·Producto:\n" + text + "\n" + "·Precio:\n" + precio + " €");
        }

        System.out.println("fin de la compra.");
    }
}
