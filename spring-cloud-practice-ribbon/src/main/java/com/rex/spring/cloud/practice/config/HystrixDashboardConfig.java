package com.rex.spring.cloud.practice.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixDashboardConfig {

    @Bean
    public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet() {
        HystrixMetricsStreamServlet servlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean<HystrixMetricsStreamServlet> result = new ServletRegistrationBean<>(servlet);
        result.setLoadOnStartup(1);
        result.addUrlMappings("/hystrix.stream");
        result.setName("HystrixMetricsStreamServlet");
        return result;
    }

}
