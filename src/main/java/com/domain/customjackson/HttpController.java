package com.domain.customjackson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HttpController {
    @GetMapping("/hello")
    public Message sayHello() {
        return new Message("Hello", LocalDate.now());
    }
}

