package com.example.exemplospring.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

    @GetMapping("ping")
    public String ping(){
        return "Pong";
    }

    @GetMapping("nome/{nome}")
    public String recebeNome(@PathVariable String nome){
        return "O nome enviado foi: "+ nome;
    }

    @GetMapping("soma")
    public String calculaSoma(@RequestParam int x, @RequestParam int y){
        return "A soma dos valores é = "+ (x+y);
    }

}
