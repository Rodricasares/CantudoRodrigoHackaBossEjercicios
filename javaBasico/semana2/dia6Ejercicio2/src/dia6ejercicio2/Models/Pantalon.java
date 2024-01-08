/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6ejercicio2.Models;

//a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
//
//Zapato: material, tipoCierre
//
//Pantalon: estilo, tipoTejido
//
//Camiseta: manga, cuello
//
//Sombrero: tipo, tamaño
public class Pantalon extends Vestimenta {
    
private String estilo;
private String tipoTejido;

    public Pantalon(String estilo, String tipoTejido, int codigo, String nombre, int precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public Pantalon(String estilo, String tipoTejido) {
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    @Override
    public String toString() {
        return "Pantalon{" + super.toString() + "estilo=" + estilo + ", tipoTejido=" + tipoTejido + '}';
    }

    public void mostrar() {
        System.out.println("Este pantalón es de marca: " + getMarca());
    }

}
