package com.questifyme.backend.controllers;

import com.questifyme.backend.Service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @GetMapping("/balance/{username}")
    public ResponseEntity<?> getBalance(@PathVariable String username){
        return new ResponseEntity<>(walletService.getBalance(username).getBalance(), HttpStatus.OK);
    }

    @PostMapping("/balance/add")
    public ResponseEntity<?> addBalance(@RequestBody Object data){
        return new ResponseEntity<>(walletService.addBalance(data), HttpStatus.OK);
    }
}
