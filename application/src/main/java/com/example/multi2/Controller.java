package com.example.multi2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${ozpath}")
    private String path;

    @GetMapping("/")
    public String get() {
        return "hello " + path + " " + System.currentTimeMillis();
    }
}
