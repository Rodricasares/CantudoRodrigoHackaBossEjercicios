package com.mycompany.dia6ejercicio1;

import com.mycompany.dia6ejercicio1.models.Empleados;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author rodri
 */
public class Dia6Ejercicio1 {

    public static void main(String[] args) {

        List<Empleados> employee = Arrays.asList(
                new Empleados("Rodri", 1000.0, "Desarrollador"),
                new Empleados("Paco", 1499.9, "Analista"),
                new Empleados("Manuel", 2500.0, "Analista"),
                new Empleados("Dani", 1500.0, "Analista"),
                new Empleados("Ana María", 2000.0, "Gerente"));

        Optional<String> filterEmployee = employee.stream()
                //He decidido mostrar los empleados que hanen la cantidad superior a 1500 €.
                //1.Lo filtro el salario.
                //2.Llamo con map al getNombre y get Salario de su metodo Clase Empleados.
                //3.Con collect.reducing y su funcion mapper concatenamos las cadenas de filtrado.
                
                .filter(empleado -> empleado.getSalario() > 1500)
                .map(empleado -> "\n" + empleado.getNombre() + " Salario: " + empleado.getSalario() +  " € " + " Categoria: "+ empleado.getCategoria())
                .collect(Collectors.reducing((s1, s2) -> s1 + ", " + s2));
        System.out.println("Empleados con salario mayor a 1500 €: " + filterEmployee.orElse("No hay empleados con un salario mayor a 1500"));

    }

}

//List<String> nombresFiltrados = employee.stream();
// Imprimir los nombres resultantes
// nombresFiltrados.forEach(System.out::println);
//        Crea una aplicación que maneje información sobre empleados
//        . Cada empleado tiene un nombre
//        , un salario y una categoría(por ejemplo
//        , "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones utilizando Streams y Optionals
//        :
//
//Filtra los empleados cuyo salario sea mayor a cierto valor específico.Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.Encuentra al empleado con el salario más alto utilizando Optionals

