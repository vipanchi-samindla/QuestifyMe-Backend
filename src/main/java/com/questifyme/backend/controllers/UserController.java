package com.questifyme.backend.controllers;

import com.questifyme.backend.Entity.User;
import com.questifyme.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody  User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }

    @GetMapping("/get/{username}")
    public ResponseEntity<?> getUser(@PathVariable String username){
        return new ResponseEntity<>(userService.getUser(username), HttpStatus.OK);
    }

    @GetMapping("/reduce-health")
    public ResponseEntity<?> reduceHealth(@RequestBody String username){
        return new ResponseEntity<>(userService.reduceHealth(username), HttpStatus.OK);
    }

    @PostMapping("/update-character")
    public ResponseEntity<?> updateCharacter(@RequestBody String username){
        return new ResponseEntity<>(userService.updateCharacter("mage", username), HttpStatus.OK);
    }

}
