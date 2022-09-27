package com.example.contuniousintegrationexc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Controller;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/asger")
    public String asger(){
        return "asger";
    }

    @GetMapping("/rasmus")
    public String rasmusSide() {
        return "rasmusSide";
    }
}
