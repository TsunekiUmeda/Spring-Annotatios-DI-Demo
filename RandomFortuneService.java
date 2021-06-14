package com.code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements IFortuneService {

    private String[] data = {"Lucky", "Super Lucky", "All day Lucky"};
    private Random rand = new Random();

    @Override
    public String getFortune() {

        return data[rand.nextInt(data.length)];
    }
}
