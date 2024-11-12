package com.springboot.api.controller;

import com.springboot.api.dto.PostRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/put")
public class PutController {
    @PutMapping(value = "/user")
    public ResponseEntity<PostRequestDto> put (@RequestBody PostRequestDto postRequestDto) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED) // 202
                .body (postRequestDto);
    }
}
