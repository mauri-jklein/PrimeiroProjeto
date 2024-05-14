package com.example.exercicios.service;

import org.springframework.stereotype.Service;

@Service
public class ExerciciosService {

    public String converteDecimalParaBinario(String binario) {
        int valDecimal = 0;
        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                valDecimal += Math.pow(2, i);
            }
        }
        return valDecimal + "";
    }

    public String converteRomanoParaDecimal(String romano) {
        int valDecimal = 0;
        for (int i = 0; i < romano.length(); i++) {
            switch (romano.charAt(i)) {
                case 'I':
                    valDecimal += 1;
                    break;
                case 'V':
                    valDecimal += 5;
                    break;
                case 'X':
                    valDecimal += 10;
                    break;
            }
        }
        return valDecimal + "";
    }

    public String verificaPalindromo(String palavra){
        String palavraInvertida = "";
        for(int i = palavra.length()-1; i>=0; i--){
            palavraInvertida += palavra.charAt(i);
        }
        if(palavra.equals(palavraInvertida)){
            return "É um palíndromo";
        }else{
            return "Não é um palíndromo";
        }
    }

    public String fatorial(int numero){
        int fatorial=1;
        for(int i= numero; i>1; i--){
            fatorial*=i;
        }
        return "O fatorial de "+ numero + " é "+ fatorial;
    }

}
