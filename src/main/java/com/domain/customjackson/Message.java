package com.domain.customjackson;

import java.time.LocalDate;

public class Message {
    private String message;
    private LocalDate date;

    public Message() {
    }

    public Message(String message, LocalDate date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
