package com.domain.customjackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;

@SpringBootApplication
public class CustomJacksonApplication {
    public static final DateTimeFormatter FORMATTER = ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        SpringApplication.run(CustomJacksonApplication.class, args);
    }
}
