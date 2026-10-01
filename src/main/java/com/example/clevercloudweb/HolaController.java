package com.example.clevercloudweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String hola() {
        return "¡Hola Mundo! Tu aplicación Spring Boot está conectada y funcionando en Clever Cloud.";
    }
}