package com.ejercicio2Dia2.numerosRomanos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class ConversorNumerico {





    @GetMapping("/numeros")
    public String realizarSorteo(){
        int numeroRandom = ThreadLocalRandom.current().nextInt(1, 1000);
        String numeroRomano = convertirARomano(numeroRandom);
        return "El número aleatorio es : " + numeroRandom + "el numero romano es: " + numeroRomano;

    }

    private String convertirARomano(int numero) {
        String[] simbolos = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] valores = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder resultado = new StringBuilder();
        for (int i = 12; i >= 0; i--) {
            while (numero >= valores[i]) {
                numero -= valores[i];
                resultado.append(simbolos[i]);
            }
        }

        return resultado.toString();
    }
    }
