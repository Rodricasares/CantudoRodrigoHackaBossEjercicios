/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia4ejercicio1;

import dia4ejercicio1.modelos.Electrodomestico;

/**
 *
 * @author Rodrigo Cantudo
 */
public class Dia4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //a) Crear 3 electrodomesticos con parametros y mostrar por pantalla       
        Electrodomestico secadora = new Electrodomestico(1, "Secadora" ,"Bosh", "XD20", 1.500, "rojo");
        Electrodomestico televisor = new Electrodomestico(2, "Televisor","LG",  "XD21", 500, "Negro");
        Electrodomestico tostador = new Electrodomestico(3, "Tostador","Teka", "XD22", 2.500, "Blanco");
        
        //b)Creo objeto sin parametros
                 
                   
        Electrodomestico lavadora = new Electrodomestico();
        //Electrodomestico lavadora1 = new Electrodomestico();
        
        //String msj = secadora.caminar();
        ///////Para imprimir por pantalla////
       
        //c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
        System.out.println("Electrodoméstico:\n"+ "\nMarca: "+secadora.getMarca()+ "\nModelo: "+secadora.getModelo()+ "\nConsumo: "+secadora.getConsumo());
        System.out.println("Electrodoméstico:\n"+ "\nMarca: "+televisor.getMarca()+ "\nModelo: "+televisor.getModelo()+ "\nConsumo: "+televisor.getConsumo());   
        System.out.println("Electrodoméstico:\n"+ "\nMarca: "+tostador.getMarca()+ "\nModelo: "+tostador.getModelo()+ "\nConsumo: "+tostador.getConsumo()); 
 
        //b)Muestr objeto sin parametros
        
        
        System.out.println("·Electrodomestico sin parámetros, haciendo la llamada a la marca:\n"+lavadora.getMarca()); 
       
        //d)¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
        // el objeto lavadora muestra por pantalla el valor null en los string y en los numerico(double 'e' int) se asignan por defecto el valor 0.
        // Electrodomestico: cod=0, nombre=null, marca=null, modelo=null, consumo=0.0, color=null
        
        
        
        
        
    }
    
}
