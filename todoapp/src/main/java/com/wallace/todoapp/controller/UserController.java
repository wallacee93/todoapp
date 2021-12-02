package com.wallace.todoapp.controller;

import com.wallace.todoapp.model.User;
import com.wallace.todoapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    private User getCurrentUser(@RequestBody User user) {
        System.out.println("GET User by username and password *****");
        return userService.getUser(user);
    }

    @GetMapping("/login/{username}/{password}")
    private boolean findUserByUsername(@PathVariable String username, @PathVariable String password) {
        System.out.println("GET User by username and password *****");
        return userService.getUserByUsername(username, password);
    }

    @PostMapping("/createUser")
    private boolean addUser(@RequestBody User user) {
        boolean user_exits = userService.findUserByUsername(user.getUsername());
        if(user_exits) {
            System.out.println("CANT CREATE USER!");
            return false;
        }
        userService.saveUser(user);
        return true;
    }
}
