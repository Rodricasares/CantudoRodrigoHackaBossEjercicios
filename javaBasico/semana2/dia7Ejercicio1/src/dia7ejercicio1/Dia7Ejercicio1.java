/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia7ejercicio1;

import dia7ejercicio1.models.Auto;
import dia7ejercicio1.models.Camioneta;
import dia7ejercicio1.models.Combustion;
import dia7ejercicio1.models.Electrico;
import dia7ejercicio1.models.Moto;
import dia7ejercicio1.models.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @RodrigoC
 */
public class Dia7Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Auto auto0 = new Auto(1000, 10, 0, "URT-52342", "Opel", "Astra", 2020, 20000);
        Auto auto1 = new Auto(1000, 10, 3, "MA-4645", "Mercedes", "Benz", 2023, 35000);
        Camioneta camion = new Camioneta(50, 100, 1, 1, "SD-24324", "Volvo", "Model-camioneta", 1988, 2000);
        Moto motito = new Moto(125, "4 tiempos", 2, "M-324", "Honda", "RX", 2023, 10000);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(auto0);
        vehiculos.add(auto1);
        vehiculos.add(camion);
        vehiculos.add(motito);

        // auto0.cargaEnergia();
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo + "\n");

            if (vehiculo instanceof Auto) {
                Auto auto = (Auto) vehiculo;
                vehiculo.cargaEnergia();
                vehiculo.antiguo();
            }
            if (vehiculo instanceof Camioneta) {
                Camioneta camioneta = (Camioneta) vehiculo;
                vehiculo.recargaCombustible();
                vehiculo.antiguo();

            }
            if (vehiculo instanceof Moto) {
                Moto moto = (Moto) vehiculo;
                vehiculo.recargaCombustible();
                vehiculo.antiguo();

            }
            System.out.println("------------------------------------------------------------\n");

        }
    }
}

//Pregunta: Auto{Vehiculo{dia7ejercicio1.models.Auto@54bedef2id=0, placa=URT-52342, marca=Opel, modelo=Astra, anio=2020, costo=20000.0}capacidadBateria=1000.0, autonomia=1000}
//¿ Porque me sale ese hasch delante en el lugar de super.toString? *dia7ejercicio1.models.Auto@54bedef2id=0
//f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos, camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.
//
//g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.
