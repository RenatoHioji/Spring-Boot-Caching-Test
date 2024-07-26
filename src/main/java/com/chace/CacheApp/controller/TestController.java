package com.chace.CacheApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/{id}")
    public ResponseEntity<String> test(@PathVariable int id){
        return ResponseEntity.ok("Hello friend, " + id);
    }
}