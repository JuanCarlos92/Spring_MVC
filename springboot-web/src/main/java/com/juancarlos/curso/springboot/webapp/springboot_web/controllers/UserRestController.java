package com.juancarlos.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancarlos.curso.springboot.webapp.springboot_web.models.User;
import com.juancarlos.curso.springboot.webapp.springboot_web.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        User user = new User("JuanCarlos", "Filter");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring Boot");

        return userDto;

    }

    @GetMapping("/list")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    public List<User> list() {
        User user = new User("JuanCarlos", "Filter");
        User user2 = new User("JuanMiguel", "Martin");
        User user3 = new User("Jose", "Alvarez");

        List<User> users = Arrays.asList(user, user2, user3);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;

    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        Map<String, Object> body = new HashMap<>();
        User user = new User("JuanC", "Filter");

        body.put("title", "Hola mundo spring boot");
        body.put("user", user);

        return body;

    }

}
