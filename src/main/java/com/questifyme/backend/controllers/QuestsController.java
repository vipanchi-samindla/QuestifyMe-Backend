package com.questifyme.backend.controllers;

import com.questifyme.backend.Entity.Quests;
import com.questifyme.backend.Service.QuestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/quests")
@RestController
public class QuestsController {

    @Autowired
    private QuestsService questsService;

    @PostMapping("/add")
    ResponseEntity<?> addquest(@RequestBody Quests req){
        return new ResponseEntity<>(questsService.addquest(req), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    ResponseEntity<?> getquests(){
        return new ResponseEntity<>(questsService.getallquests(),HttpStatus.OK);
    }
    @GetMapping("/active")
    ResponseEntity<?> getactivequests(){
        return new ResponseEntity<>(questsService.getActiveQuests(),HttpStatus.OK);
    }

    @GetMapping("/has_user/{quest_id}/{user_name}")
    ResponseEntity<?> getCompletionStatus(@PathVariable int quest_id, @PathVariable String user_name){
        return new ResponseEntity<>(questsService.getCompletionStatus(quest_id,user_name),HttpStatus.OK);
    }

    @GetMapping("/last_five")
    ResponseEntity<?> getPreviousFiveQuests(){
        return new ResponseEntity<>(questsService.getLastFiveQuests(),HttpStatus.OK);
    }

    @PostMapping("/add_user/{user}/{quest_id}")
    ResponseEntity<?> getCompletion(@PathVariable String user,@PathVariable int quest_id){
        return new ResponseEntity<>(questsService.addUser(user,quest_id),HttpStatus.OK);
    }

}
