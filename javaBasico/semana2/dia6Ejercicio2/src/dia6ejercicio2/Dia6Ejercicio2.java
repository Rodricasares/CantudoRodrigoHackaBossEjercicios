/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia6ejercicio2;

import dia6ejercicio2.Models.Camiseta;
import dia6ejercicio2.Models.Pantalon;
import dia6ejercicio2.Models.Sombrero;
import dia6ejercicio2.Models.Vestimenta;
import dia6ejercicio2.Models.Zapato;

/**
 *
 * @author minero
 */
public class Dia6Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).
        Zapato zapato1 = new Zapato("Cuero", "Cordones", 0, "Adidas-bajas", 38, "Adidas", "EU", "Blanco");
        Zapato zapato2 = new Zapato("Plastico", "Cordones", 1, "Nike-Jordan", 38, "Nike", "USA", "Negros");
        Zapato zapato3 = new Zapato("Tela", "Cordones", 2, "Vans-Linea", 38, "Vans", "EU", "Azul");

        Pantalon pantalon1 = new Pantalon("Largo", "Vaquero", 0, "Levis,largo", 80, "Levis", "M", "Grís");
        Pantalon pantalon2 = new Pantalon("Corto", "Tela", 1, "Rastro,largo", 20, "Prymax", "XL", "Blanco");
        Pantalon pantalon3 = new Pantalon("Largo", "Pana", 2, "Zara-pantalón", 80, "Zara", "S", "Rojo");

        Camiseta camiseta1 = new Camiseta("Adidas-Camisa", "Alto", 0, "Camisa+logo", 25, "Adidas", "M", "Amarilla");
        Camiseta camiseta2 = new Camiseta("Nike-Camisa", "Roto", 1, "Camisa, simple", 35, "Nike", "S", "Rosa");

        Sombrero sombrero = new Sombrero("Copa", "M", 0, "Sombrero de copa", 22, "Marca-Sombrero", "M", "Negro");

        Vestimenta[] vectorVestimenta = new Vestimenta[9];

        vectorVestimenta[0] = zapato1;
        vectorVestimenta[1] = zapato2;
        vectorVestimenta[2] = zapato3;
        vectorVestimenta[3] = pantalon1;
        vectorVestimenta[4] = pantalon2;
        vectorVestimenta[5] = pantalon3;
        vectorVestimenta[6] = camiseta1;
        vectorVestimenta[7] = camiseta2;
        vectorVestimenta[8] = sombrero;
//c) Crear los siguientes métodos (en cada subclase correspondiente):
        zapato1.mostrar();
        zapato2.mostrar();
        zapato3.mostrar();
        pantalon1.mostrar();
        pantalon2.mostrar();
        pantalon3.mostrar();
        camiseta1.mostrar();
        camiseta2.mostrar();
        sombrero.mostrar();

        
        //d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
        for (int i = 0; i < vectorVestimenta.length; i++) {
            Vestimenta vestimenta = vectorVestimenta[i];
            //System.out.println(vestimenta);            
        }

    }

}
