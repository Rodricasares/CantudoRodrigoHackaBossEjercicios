/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6ejercicio2.Models;

/**
 a) Crear las siguientes clases hijas que compartan sus atributos y métodos:

Zapato: material, tipoCierre

Pantalon: estilo, tipoTejido

Camiseta: manga, cuello

Sombrero: tipo, tamaño
 
 */
public class  Sombrero extends Vestimenta{
    
private String tipo;
private String tamaño;

    public Sombrero(String tipo, String tamaño, int codigo, String nombre, int precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public Sombrero(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Sombrero{"+ super.toString() + "tipo=" + tipo + ", tama\u00f1o=" + tamaño + '}';
    }

   
    
        public void mostrar() {
        System.out.println("Este sombrero es de marca: " + getMarca());    }

}
