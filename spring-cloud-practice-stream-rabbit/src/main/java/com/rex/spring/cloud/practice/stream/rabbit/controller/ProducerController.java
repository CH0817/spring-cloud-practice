package com.rex.spring.cloud.practice.stream.rabbit.controller;

import com.rex.spring.cloud.practice.stream.rabbit.binding.HelloBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private MessageChannel greet;

    public ProducerController(HelloBinding binding) {
        greet = binding.greeting();
    }

    /**
     * 發送 message 給所有訂閱者
     *
     * @param name name
     */
    @GetMapping("/greet/{name}")
    public void publish(@PathVariable String name) {
        String greeting = "Hello, " + name + "!";
        Message<String> msg = MessageBuilder.withPayload(greeting).build();
        this.greet.send(msg);
    }

}
