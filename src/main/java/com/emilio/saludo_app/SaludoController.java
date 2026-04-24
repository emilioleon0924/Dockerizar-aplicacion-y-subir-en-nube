package com.emilio.saludo_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola, soy Emilio León (s23017360) y espero sacar de 8 pa arriba:)";
    }
}