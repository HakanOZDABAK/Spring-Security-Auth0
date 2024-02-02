package com.hakanozdabak.springsecurityauth0.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")

public class MessageController {

    @Value("${frontend.url}")
    private String frontendUrl;
    @GetMapping("/hello")
    public String helloMessage(){
        return frontendUrl;
    }

}
