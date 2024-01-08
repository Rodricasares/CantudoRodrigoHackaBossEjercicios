/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia2ejercicio2;

/**
 *
 * @author Cantudo Rodrigo
 */
public class Dia2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num5 = 5;
        int num = 2;
        byte num2 = 2;
        long num3 = 5;
        double decimalNum = 15.23;
        float decimalNum2 = 0.5f;
        char letter = '@';
        boolean flag = true;
        double num6 = 8;

        String text = "Hola Hack ";
        String text2 = "a Boss ";
        String text3 = "TOTAL: ";
        System.out.println("Hola mundo: " + num);
        System.out.println("1- La variable num es de tipo int: " + num);
        System.out.println("2- La variable num2  es de tipo byte: " + num2);
        System.out.println("3- La variable num3  es de tipo long: " + num3);
        System.out.println("4- La variable num6  es de tipo double: " + num6);
        System.out.println("5- La variable decimalNum  es de tipo String: " + decimalNum);
        System.out.println("6- La variable decimalNum2  es de tipo String: " + decimalNum2);
        System.out.println("7- La variable letter  es de tipo char: " + letter);
        System.out.println("8- La variable flag  es de tipo boolean: " + flag);
        System.out.println("9- La variable text  es de tipo String: " + text + "\n" + text2);
        System.out.println("10- La variable que utilicemos en calculos deven ser envueltas entre ( 5 + 2 = 7 ) no es 52 como muestra por pantalla."+"\n"+"La operacion sera erronea como aquí: " +"\n"+ text3 + num5 + num); 
// Cuidado con los cálculos            (siempre entre paréntesis)       
        System.out.println("11-Cálculo entre paréntesis, como Java lo interpreta + String " + text3 + (num5 + num));
    
    }
    
}
