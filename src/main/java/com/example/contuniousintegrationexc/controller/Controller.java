package com.example.contuniousintegrationexc.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping()
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

    @GetMapping("/toby")
    public String toby(){
        return "TobyHTML";
    }


}
