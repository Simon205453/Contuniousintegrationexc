package com.example.contuniousintegrationexc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/skerder")
    public String skerder(){
        return "skerder";
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
