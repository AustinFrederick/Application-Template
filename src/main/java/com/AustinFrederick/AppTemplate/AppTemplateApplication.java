package com.AustinFrederick.AppTemplate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class AppTemplateApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<AppTemplateApplication> applicationClass = AppTemplateApplication.class;
}
@Controller
class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}