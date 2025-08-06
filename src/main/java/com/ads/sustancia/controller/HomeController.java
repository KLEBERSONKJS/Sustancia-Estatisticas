package com.ads.sustancia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    

    @GetMapping()
    public String pagInicial(){
        return "pag-inicial";
    }
    @GetMapping("/home")
    public String homePage(){
        return "index";
    }
}
