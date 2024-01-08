/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia4ejercicio1.modelos;

/**
 *
 * @author Rodrigo Cantudo
 */
public class Electrodomestico {
    
      //atributos de la clase
   public int cod;
   private String nombre;
   private String marca;
   private String modelo;
   private double consumo;
   private String color;

 
   public Electrodomestico(){

}
 
 
   public Electrodomestico(int cod, String nombre, String marca ,String modelo,double consumo, String color){
       
       this.cod = cod;
       this.nombre = nombre;
       this.marca = marca;
       this.modelo = modelo;
       this.consumo = consumo;
       this.color = color;

}

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
 /////////////////////////////////////////
   
 public String caminar() {
   String caminar = "caminar";
       return caminar;
 }
  public static void pay() {
      System.out.println("pagado!!!");
 
  }
  //////////////////////////////////////////

    @Override
    public String toString() {
        return "Electrodomestico: " + "cod=" + cod + ", nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", consumo=" + consumo + ", color=" + color;
    }
  
  
    
}
