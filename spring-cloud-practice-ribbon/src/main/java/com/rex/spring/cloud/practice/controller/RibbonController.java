package com.rex.spring.cloud.practice.controller;

import com.rex.spring.cloud.practice.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    private SayHiService sayHiService;

    @Autowired
    public RibbonController(SayHiService sayHiService) {
        this.sayHiService = sayHiService;
    }

    @GetMapping("/hi")
    public String sayHi(String name) {
        return sayHiService.sayHi(name);
    }

}
