package com.hakanozdabak.springsecurityauth0.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
@CrossOrigin
public class MessageController {


    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello Guys";
    }
}
