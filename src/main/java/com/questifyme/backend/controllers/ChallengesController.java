package com.questifyme.backend.controllers;

import com.questifyme.backend.Entity.Challenges;
import com.questifyme.backend.Service.ChallengsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/challenge")
@RestController
public class ChallengesController {
    @Autowired
    private ChallengsService challengsService;

    @PostMapping("/add")
    ResponseEntity<?> addChallenge(@RequestBody Challenges req){
        return new ResponseEntity<>(challengsService.addChallenge(req), HttpStatus.OK);
    }

    @PostMapping("/edit")
    ResponseEntity<?> editChallenge(@RequestBody Challenges req){
        return new ResponseEntity<>(challengsService.editChallenge(req), HttpStatus.OK);
    }

    @GetMapping("/all/{user_name}")
    ResponseEntity<?> getAllChallengesByUser(@PathVariable String user_name){
        return new ResponseEntity<>(challengsService.GetAllChallengesByName(user_name),HttpStatus.OK);
    }

    @GetMapping("/chart/task_progress/{username}")
    ResponseEntity<?> taskProgress(@PathVariable String username){
        return new ResponseEntity<>(challengsService.taskProgress(username),HttpStatus.OK);
    }
    
}
