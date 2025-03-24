package com.empresaCampTalentos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// o meu rest controller escuta todas as requisicoes mapeadas no endpoint
@RestController
@RequestMapping("/hello-world") //parametro
public class HelloWorldController {
    /** criando umm metodo que vai reagir a requisição get do endpoint
    para receber a mensagemhelloworld eu tenho que dar um get no endpoint helloworld, assim ativo o método helloWorld
    se eu quiser que responda a outro pacote dentro de helloworld e não a raiz, devo usar gtmap('/subppasta')
    **/

    @GetMapping
    public String helloworld(){
        return "Olá mundo!";
    }
}
