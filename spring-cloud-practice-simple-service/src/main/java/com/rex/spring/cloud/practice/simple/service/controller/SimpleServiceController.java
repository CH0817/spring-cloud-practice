package com.rex.spring.cloud.practice.simple.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class SimpleServiceController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String sayHi(String name) {
        return String.format("Hi %s from port %s", name, port);
    }

}
