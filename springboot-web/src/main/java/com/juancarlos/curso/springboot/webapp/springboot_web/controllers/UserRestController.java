package com.juancarlos.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancarlos.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details(){
        Map <String, Object> body = new HashMap<>();
        User user = new User("JuanC","Filter");

        body.put("title", "Hola mundo spring boot");
        body.put("user", user);
        
        return body;
        
    }

}
