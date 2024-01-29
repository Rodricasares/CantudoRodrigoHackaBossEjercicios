package com.morse.conversor.morse;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCode {

    @GetMapping("/{valor}")
    public String simbol(@PathVariable String valor) {
        String valorAconvertir = convertirAmorse(valor.toLowerCase());
        System.out.println("Recogemos valor " + valorAconvertir);

        return "Inserte su letra o número:" + valorAconvertir;
    }

    public String convertirAmorse(String valorX) {
        // return valorX;
        char[] abecedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','0','1','2','3','4','5','6','7','8','9'};
        String[] morseAbecedario = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..","- - - - -","· - - - -","· · - - -","· · · - -","· · · · -","· · · · ·","- · · · ·","- - · · ·","- - - · ·","- - - - ·"};
       // int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < abecedario.length; i++) {
            if (valorX.charAt(0) == abecedario[i] || valorX.charAt(0) == Character.toLowerCase(abecedario[i])){
                resultado.append(morseAbecedario[i]);


            }

        }
        return resultado.toString();
    }
}