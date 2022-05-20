package com.itj.workshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/bye")
    public String byeWorld() {
        return "Bye ITJ Whorkshop group .. Thanks";
    }

}
