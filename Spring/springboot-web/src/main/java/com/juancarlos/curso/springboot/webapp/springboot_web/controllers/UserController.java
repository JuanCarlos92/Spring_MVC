package com.juancarlos.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.juancarlos.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("juan carlos", "filter martin");

        user.setEmail("juancarlos@gmail.com");
        model.addAttribute("title", "Hola mundo spring boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
                new User("Pepa", "Gonzalez"),
                new User("Carlos", "Perez","correo@gmail.com"),
                new User("Juana", "Roe","correojuana@gmail.com"),
                new User("Maria", "Doe"));

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";

    }

}