package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigureBean.class);



        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        System.out.println(messageService.getMessage());

        MessageService messageService2 = applicationContext.getBean("messageService", MessageService.class);
        System.out.println(messageService2.getMessage());

        MessageService messageService3 = applicationContext.getBean("messageRandomService", MessageService.class);
        System.out.println(messageService3.getMessage());


        System.out.println("hashcode 1 zmienna:" + messageService.hashCode());
        System.out.println("hashcode 2 zmienna:" + messageService2.hashCode());
        System.out.println("hashcode 3 zmienna:" + messageService3.hashCode());


    }
}
