package com.formatoweb.p05dic2023s.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class mainController {
    @GetMapping("/main")
    public String getMain(){
        return "Llegando a main";
    }
}
