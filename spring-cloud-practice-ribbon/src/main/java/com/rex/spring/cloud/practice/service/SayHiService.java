package com.rex.spring.cloud.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SayHiService {

    private RestTemplate restTemplate;

    @Autowired
    public SayHiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String sayHi(String name) {
        return restTemplate.getForObject("http://spring-cloud-practice-simple-service/simple/hi?name=" + name, String.class);
    }

}
