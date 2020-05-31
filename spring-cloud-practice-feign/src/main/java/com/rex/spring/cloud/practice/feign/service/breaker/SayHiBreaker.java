package com.rex.spring.cloud.practice.feign.service.breaker;

import com.rex.spring.cloud.practice.feign.service.SayHiService;
import org.springframework.stereotype.Component;

/**
 * SayHiService 的熔斷器
 */
@Component
public class SayHiBreaker implements SayHiService {

    @Override
    public String sayHi(String name) {
        // 當所有的 spring-cloud-practice-simple-service 都無法請求時就進入此 method
        return String.format("sayHi() with %s has error!", name);
    }

}
