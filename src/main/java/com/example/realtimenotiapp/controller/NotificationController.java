package com.example.realtimenotiapp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotificationController {

    //Server App
    @MessageMapping("/sendMessage") // To send message /app/sendMessage
    @SendTo("/topic/notifications") //Broker
    public String sendMessage(String message)
    {
        System.out.println("Message: "+message);
        return message;
    }

    //clients
    //Admin
    @GetMapping(value = "/index")
    public String index()
    {
        return "index";
    }

    //Admin
    @GetMapping(value = "/client1")
    public String client1()
    {
        return "client1";
    }

    //Admin
    @GetMapping(value = "/client2")
    public String client2()
    {
        return "client2";
    }
}
