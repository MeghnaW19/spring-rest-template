package com.stackroute.commander.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CovidStatApplication {
    public static void main(String[] args) {
        SpringApplication.run(CovidStatApplication.class, args);
    }


    /*
        Bean for Rest Template to auto wire the Rest Template object.
    */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
