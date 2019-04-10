package com.example.experimentday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/first")
public class FirstController {

    @GetMapping
    public String first() {
        return "I am the first controller";
    }
}
