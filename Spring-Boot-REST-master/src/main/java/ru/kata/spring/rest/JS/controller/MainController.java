package ru.kata.spring.rest.JS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

}