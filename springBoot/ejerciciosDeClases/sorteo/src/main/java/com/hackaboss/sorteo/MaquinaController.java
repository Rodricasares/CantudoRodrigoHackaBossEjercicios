package com.hackaboss.sorteo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class MaquinaController {

@GetMapping("/sorteo1")
    public Double realizarSorteo(){
    Random random = new Random();
    int randomNumber = random.nextInt(100);
    System.out.println("El numero es:\n");
    return (double) randomNumber;


}
    @GetMapping("/sorteo2")
    public List<Double> realizarSorteo2() {
        List<Double> listaNumerosAleatorios = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Número: " + (i + 1) + ": " + randomNumber);
            listaNumerosAleatorios.add((double) randomNumber);
        }

        return listaNumerosAleatorios;
    }
    @GetMapping("/sorteo3")
    public String realizarSorteo3() {
    int numeroRandom = ThreadLocalRandom.current().nextInt(1, 100);
    return "El número sorteado es: " + numeroRandom;
}

}
