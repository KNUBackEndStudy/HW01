package com.springboot.api.controller;

import com.springboot.api.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    @PostMapping("/key")
    public String post(@RequestBody Map<String, Object> requestData){
        StringBuilder sb = new StringBuilder();

        requestData.forEach((key, value) -> {
            sb.append("key : ").append(key).append("\n");
            sb.append("value : ").append(value).append("\n");
        });
        return sb.toString();
    }
    @PostMapping("/info")
    public PostRequestDto post1(@RequestBody PostRequestDto postRequestDto){
        return postRequestDto;
    }
}