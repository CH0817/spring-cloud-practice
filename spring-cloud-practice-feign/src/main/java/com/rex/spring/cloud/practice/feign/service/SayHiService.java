package com.rex.spring.cloud.practice.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// name = 要使用的服務提供者的 spring.application.name
@FeignClient(name = "spring-cloud-practice-simple-service")
public interface SayHiService {

    // @RequestParam 是必要參數，否則會發生 Method Not Allowed 的錯誤
    @GetMapping("/simple/hi")
    String sayHi(@RequestParam("name") String name);

}
