package com.juancarlos.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.juancarlos.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("JuanC", "Filter");
        user.setEmail("correo@gmail.com");
        model.addAttribute("title", "Hola mundo spring boot");
        model.addAttribute("user", user);
        return "details";

    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        model.addAttribute("title", "Listado de usuarios!");

        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel() {
        return Arrays.asList(
                new User("pepa", "Gonzalez"),
                new User("Manuel", "Jimenez"),
                new User("Alberto", "Hebles"),
                new User("Felix", "Ruger"));

    }
}
