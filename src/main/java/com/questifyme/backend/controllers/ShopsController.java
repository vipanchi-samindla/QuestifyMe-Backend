package com.questifyme.backend.controllers;

import com.questifyme.backend.Entity.Shop;
import com.questifyme.backend.Service.ShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/shops")
@RestController
public class ShopsController {
    @Autowired
    private ShopsService shopsService;

    @PostMapping("/add")
    ResponseEntity<?> addShopItem(@RequestBody Shop req){
        return new ResponseEntity<>(shopsService.addShopItem(req), HttpStatus.OK);
    }

    @GetMapping("/all")
    ResponseEntity<?> getAllShopItem(){
        return new ResponseEntity<>(shopsService.getAllShopItem(), HttpStatus.OK);
    }

    @PostMapping("/add_user/{name}/{shop_id}")
    ResponseEntity<?> addUsertoShop(@PathVariable String name,@PathVariable Long shop_id){
        return new ResponseEntity<>(shopsService.addUserToShopItem(name,shop_id), HttpStatus.OK);
    }
}
