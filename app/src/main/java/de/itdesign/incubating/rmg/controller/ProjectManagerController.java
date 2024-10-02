package de.itdesign.incubating.rmg.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ProjectManagerController {

    @MessageMapping("/sayHello")
    @SendTo("/topic/sayHello")
    public String sayHello(@Payload String a){
        System.out.println("Message called");
        System.out.println("Message from client" + a);
        return a;
    }
}
