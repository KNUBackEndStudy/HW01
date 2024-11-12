package com.springboot.api.controller;

import com.springboot.api.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get")
public class GetController {
    @GetMapping("/info")
    public String getName(){
        return "황형진, 01030369968, 202104389, brotherhwang12@gmail.com";
    }
}


