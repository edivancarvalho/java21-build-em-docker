package com.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class wellController {

    @GetMapping("/ola")
    public String olaEdivan() {
        return "Olá, Edivan 2024!";
    }
}
