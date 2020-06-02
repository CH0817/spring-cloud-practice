package com.rex.spring.cloud.practice.feign.controller;

import com.rex.spring.cloud.practice.feign.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping("/feign")
@RefreshScope
public class FeignController {

    private Environment environment;
    private SayHiService sayHiService;
    @Value("${my.identify}")
    private String identify;

    @Autowired
    public FeignController(SayHiService sayHiService, Environment environment) {
        this.sayHiService = sayHiService;
        this.environment = environment;
    }

    @GetMapping("/hi")
    public String sayHi(String name) {
        System.out.println("======================");
        Stream.of(environment.getActiveProfiles()).forEach(System.out::println);
        System.out.println("======================");
        System.out.println(identify);
        System.out.println("======================");
        return sayHiService.sayHi(name);
    }

}
