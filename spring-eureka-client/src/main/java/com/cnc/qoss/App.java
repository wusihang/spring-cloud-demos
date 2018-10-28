package com.cnc.qoss;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class App {

    @Value("${hello}")
    String hello;
    @RequestMapping("/")
    public String home() {
        return "Hello " + hello;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}