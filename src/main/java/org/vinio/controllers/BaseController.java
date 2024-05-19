package org.vinio.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public ResponseEntity<?> homePage(){
        return ResponseEntity.ok("Home page");
    }

    @GetMapping("/checkHealth")
    public ResponseEntity<?> checkHealth(){
        return ResponseEntity.ok("Healthy");
    }
}
