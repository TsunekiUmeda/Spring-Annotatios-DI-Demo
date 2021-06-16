package com.code.springdemo.fortune;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {"Lucky", "Super Lucky", "All day Lucky"};
    private Random rand = new Random();

    @Override
    public String getFortune() {

        return data[rand.nextInt(data.length)];
    }
}
