package com.ecommerce.orderservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration

@Slf4j
public class Config {

    @Bean
    RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        log.info("Hashcode {}", String.valueOf(restTemplate.hashCode()));
        return restTemplate;
    }
}
