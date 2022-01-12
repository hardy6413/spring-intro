package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageServiceNumberTwo = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println("Hascode of message service = " + messageService.hashCode() +
                "\nHashcode of messageServiceNumberTwo = " + messageServiceNumberTwo.hashCode() +
                "\nAre they the same object? " + messageService.equals(messageServiceNumberTwo));

        applicationContext.close();
    }
}
