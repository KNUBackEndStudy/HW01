package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get")
public class GetController {
    @GetMapping("/name")
    public String getName(){
        return "황형진";
    }

    @GetMapping("/member/{email}")
    public String findByEmail(@PathVariable("email") String email ) {
        return "email: " + email;
    }
}


