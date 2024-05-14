package com.example.exercicios.controller;

import com.example.exercicios.service.ExerciciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExerciciosController {

    @Autowired
    ExerciciosService exerciciosService;

    @GetMapping("binToDec/{binario}")
    public String bindarioParaDecimal(@PathVariable String binario){
        return exerciciosService.converteDecimalParaBinario(binario);
    }

    @GetMapping("romToDec/{romano}")
    public String romanoParaDecimal(@PathVariable String romano){
        return exerciciosService.converteRomanoParaDecimal(romano);
    }

    @GetMapping("fatorial/{numero}")
    public String romanoParaDecimal(@PathVariable int numero){
        return exerciciosService.fatorial(numero);
    }

}
