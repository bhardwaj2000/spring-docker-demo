package com.example.demo.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {

    @GetMapping("/health")
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok("Component is deployed");
    }


}
