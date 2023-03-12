package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {
    @GetMapping("/")
    public String homePage() {
        return "home";
    }
    @GetMapping("/authenticated")
    public String pageForAuthenticatedUsers(Principal principal) {
        return "secured part of web service: " + principal.getName();
    }

    @GetMapping("/user")
    public String pageForReadProfile(Principal principal) {
        return "User: " + principal.getName();
    }

    @GetMapping("/admin")
    public String pageOnlyForAdmins() {
        return "admins page";
    }

}
