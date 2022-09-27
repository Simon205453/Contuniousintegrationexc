package com.example.contuniousintegrationexc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

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

    @GetMapping("/simon")
    public String simon(){
        return "simon";
    }

    @GetMapping("/rasmus")
    public String rasmusSide() {
        return "rasmusSide";
    }

    @GetMapping("/toby")
    public String toby(){
        return "TobyHTML";
    }
}
