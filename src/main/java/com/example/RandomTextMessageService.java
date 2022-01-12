package com.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("RandomMessageService")
public class RandomTextMessageService implements MessageService{

    private final List<String> textMessages = Arrays.asList(
            "Hello",
            "Goodbye",
            "Yes",
            "No",
            "11111",
            "Can you hear me ?",
            "It is me",
            "Good morning",
            "Pleasure to meet you",
            "222222222"
    );


    @Override
    public String getMessage() {
        return textMessages.get(new Random().nextInt(textMessages.size()));
    }
}
