package com.domain.customjackson;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/hello")
public class HttpController {
    @GetMapping
    public Message sayHello(@RequestParam("name") String name) {
        return new Message(name, LocalDate.now());
    }

    @PostMapping
    public String updateMessage(@RequestBody Message message) {
        System.out.println("========================");
        System.out.println(message);
        System.out.println("========================");
        return "OK";
    }
}

