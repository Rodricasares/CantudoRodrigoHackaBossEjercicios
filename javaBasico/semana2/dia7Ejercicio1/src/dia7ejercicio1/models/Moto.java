/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia7ejercicio1.models;

import java.util.ArrayList;

/**
 *
 * @author minero
 */
public class Moto extends Vehiculo implements Combustion {

    private int cilindrada;
    private String tipoMotor;

    
    
    public Moto(int cilindrada, String tipoMotor, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "Moto: "+ super.toString() + "\nCilindrada=" + cilindrada + "\nTipo Motor=" + tipoMotor  ;
    }
                
    
    @Override
    public void antiguo() {
 System.out.println("La fabricacion de la moto es del año: " + anio);
    }
  

   @Override
    public void recargaCombustible() {
           System.out.println("El tipo de recarga que están haciendo es de combustion ");
           System.out.println("Su cilindrada es : " + cilindrada +"º");
           System.out.println("Motor tipo: " + tipoMotor);

    }



}
