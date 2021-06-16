package com.code.springdemo.fortune;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Tomorrow is good day";
    }
}
