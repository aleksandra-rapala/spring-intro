package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


//Otrzymujesz ten błąd, ponieważ po stworzeniu instancji kontener próbuje przypisać ten sam obiekt do obu klas

@Component("messageRandomService")
public class RandomTextMessageService implements MessageService{

    private String[] tablica={ "wiad1", "wiad2", "wiad3", "wiad4", "wiad5", "wiad6", "wiad7", "wiad8", "wiad9", "wiad10"};

            //konstruktor
    public RandomTextMessageService(){


    }



    @Override
    public String getMessage() {


        int zakres=tablica.length-1; // jaki jest najwy?szy index tej tablicy? Ilo?? element�w w tablicy (tablica.length) – 1
        int szczesliwynumerek=(int)Math.round(Math.random()*zakres); // wylosuj liczb? z zakresu [0,zakres]

        return tablica[szczesliwynumerek]; // wy?wietl element tablicy

    }
}


