package com.rex.spring.cloud.practice.stream.rabbit;

import com.rex.spring.cloud.practice.stream.rabbit.binding.HelloBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(HelloBinding.class)
public class StreamRabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitApplication.class, args);
    }

}
