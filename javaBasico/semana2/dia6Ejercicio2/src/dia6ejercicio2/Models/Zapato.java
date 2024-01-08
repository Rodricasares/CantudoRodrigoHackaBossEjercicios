/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6ejercicio2.Models;

/**
 *
 * @author RodrigoC
 */
//a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
//
//Zapato: material, tipoCierre
//
//Pantalon: estilo, tipoTejido
//
//Camiseta: manga, cuello
//
//Sombrero: tipo, tamaño



 public class Zapato extends Vestimenta{
    
    private String material;
    private String tipoCierre;

    public Zapato(String material, String tipoCierre, int codigo, String nombre, int precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public Zapato(String material, String tipoCierre) {
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    @Override
    public String toString() {
        return "Zapato{"+super.toString() + "material=" + material + ", tipoCierre=" + tipoCierre + '}';
    }

 
    
  
    public void mostrar() {
    System.out.println("Estos zapatos son de marca: " + getMarca());     }
    
}
