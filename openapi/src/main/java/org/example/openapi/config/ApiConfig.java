package org.example.openapi.config;


import org.example.openapi.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public TestService testService() {
        return new TestService();
    }
}