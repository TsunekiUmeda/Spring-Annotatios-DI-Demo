package com.code.springdemo;

import org.springframework.stereotype.Component;

//Specifying component name
@Component("restFortuneService")
public class RESTFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
