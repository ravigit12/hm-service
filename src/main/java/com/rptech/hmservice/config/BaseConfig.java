package com.rptech.hmservice.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

/**
 * The Class PersistenceJPAConfig.
 */
@Configuration
@ComponentScan(basePackages = { "com.rptech.hmservice" })
public class BaseConfig {


    @Bean
    public HttpHeaders httpHeaders() {
        return new HttpHeaders();
    }



}