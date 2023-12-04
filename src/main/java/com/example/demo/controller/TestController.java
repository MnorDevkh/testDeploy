package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/lms/v1/")
public class TestController {
    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        String response = "hello";
        return ResponseEntity.ok(response);
    }
}
