package com.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class ConfigureBean {


    @Bean
    MessageService messageService(){
        return new MyNameMessageService();
    }


        @Bean
        @Scope("prototype")
        MessageService messageRandomService(){
            return new RandomTextMessageService();
        }


    }

