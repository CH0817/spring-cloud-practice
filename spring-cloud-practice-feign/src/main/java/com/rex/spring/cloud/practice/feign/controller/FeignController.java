package com.rex.spring.cloud.practice.feign.controller;

import com.rex.spring.cloud.practice.feign.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

    private SayHiService sayHiService;

    @Autowired
    public FeignController(SayHiService sayHiService) {
        this.sayHiService = sayHiService;
    }

    @GetMapping("/hi")
    public String sayHi(String name) {
        return sayHiService.sayHi(name);
    }

}
