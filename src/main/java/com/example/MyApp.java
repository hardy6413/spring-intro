package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"guru.springframework.sfgdi", "com.springframework.pets"})
public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAppConfig.class);

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageServiceNumberTwo = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println("Hascode of message service = " + messageService.hashCode() +
                "\nHashcode of messageServiceNumberTwo = " + messageServiceNumberTwo.hashCode() +
                "\nAre they the same object? " + messageService.equals(messageServiceNumberTwo));

    }
}
