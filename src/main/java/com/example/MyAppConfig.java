package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example"})
public class MyAppConfig {
    /*
    @Bean
    public MessageService messageService(){
        return new MyNameMessageService();
    }
     */


}
