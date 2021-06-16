package com.code.springdemo;

public class SadFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Tomorrow is good day";
    }
}
