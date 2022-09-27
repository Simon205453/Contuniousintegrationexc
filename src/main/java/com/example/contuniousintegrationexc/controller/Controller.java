package com.example.contuniousintegrationexc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Controller {

    @GetMapping
    public String index(){
        return "/index";
    }

    @GetMapping("/rasmus")
    public String rasmusSide() {
        return "rasmusSide";
    }
}
