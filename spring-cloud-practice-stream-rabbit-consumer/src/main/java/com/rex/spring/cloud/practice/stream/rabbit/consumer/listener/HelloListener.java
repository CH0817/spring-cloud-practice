package com.rex.spring.cloud.practice.stream.rabbit.consumer.listener;

import com.rex.spring.cloud.practice.stream.rabbit.consumer.binding.HelloBinding;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(HelloBinding.class)
public class HelloListener {

    /**
     * 監聽 greetingChannel binding
     *
     * @param msg input message
     */
    @StreamListener(HelloBinding.GREETING_CHANNEL)
    public void processGreetingChannel(String msg) {
        System.out.println(msg);
    }

}
