package com.rex.spring.cloud.practice.stream.rabbit.consumer.binding;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface HelloBinding {

    String GREETING_CHANNEL = "greetingChannel";

    @Input(GREETING_CHANNEL)
    SubscribableChannel greeting();

}
