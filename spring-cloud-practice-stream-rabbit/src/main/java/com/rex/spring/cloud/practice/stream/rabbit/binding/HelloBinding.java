package com.rex.spring.cloud.practice.stream.rabbit.binding;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface HelloBinding {

    @Output("greetingChannel")
    MessageChannel greeting();

}
