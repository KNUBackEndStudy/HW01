package com.springboot.api.controller;

import com.springboot.api.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get")
public class GetController {

    @GetMapping("/getUser")
    public PostRequestDto getUser() {
        PostRequestDto dto = new PostRequestDto();
        dto.setName("Deㅇㅁㅇ");
        dto.setEmail("default@example.com");
        dto.setSchoolNum("123456");
        dto.setPhoneNumber("01012345678");
        return dto;
    }
}


