package com.dev.BackendLV.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

// URL: http://localhost:8080/

public class Hello {

    @GetMapping
    public String hello() {
        return "Ola mundo!" + new Date();
    }
}
