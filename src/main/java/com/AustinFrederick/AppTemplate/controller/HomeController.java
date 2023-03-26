package com.AustinFrederick.AppTemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
