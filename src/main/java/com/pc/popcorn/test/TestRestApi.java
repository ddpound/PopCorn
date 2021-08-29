package com.pc.popcorn.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestApi {

    @GetMapping("test")
    public String TestGetApi(){
        return "Test Clear";
    }
}
