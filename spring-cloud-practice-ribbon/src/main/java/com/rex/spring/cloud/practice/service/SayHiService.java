package com.rex.spring.cloud.practice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "sayHiError")
    public String sayHi(String name) {
        return restTemplate.getForObject("http://spring-cloud-practice-simple-service/simple/hi?name=" + name, String.class);
    }

    private String sayHiError(String name) {
        // 當所有的 spring-cloud-practice-simple-service 都無法請求時就進入此 method
        return String.format("Ribbon sayHi() with %s has error!", name);
    }

}
