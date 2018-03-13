package com.domain.customjackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;

@SpringBootApplication
public class CustomJacksonApplication implements Jackson2ObjectMapperBuilderCustomizer {
    public static final DateTimeFormatter FORMATTER = ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        SpringApplication.run(CustomJacksonApplication.class, args);
    }

    @Override
    public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
        jacksonObjectMapperBuilder.indentOutput(true);
        jacksonObjectMapperBuilder.serializationInclusion(JsonInclude.Include.NON_NULL);
    }
}
