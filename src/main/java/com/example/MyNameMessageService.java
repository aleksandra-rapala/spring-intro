package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {

    public String getMessage(){
                return "Aleksandra Rąpała";
    }
}
