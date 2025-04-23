package br.edu.catolica.bcc.exemplo_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //metodo para buscar o nome de um usuario
    @GetMapping("/{name}")
    public String helloUser(@PathVariable("/name") String name){

        System.out.println("Dalina**************************************");
        return "Seja bem vindo" + name;
    }
}
