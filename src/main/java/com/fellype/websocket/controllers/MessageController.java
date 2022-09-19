package com.fellype.websocket.controllers;

import com.fellype.websocket.dtos.Greeting;
import com.fellype.websocket.dtos.HelloMessage;
import com.fellype.websocket.dtos.MessageDto;
import com.fellype.websocket.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MessageController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greet(HelloMessage message) throws InterruptedException {
        System.out.println("dkfjkdjfkdfmlskfos");
        Thread.sleep(2000);
        return new Greeting("Hello, " +
                HtmlUtils.htmlEscape(message.getName()));
    }

}
