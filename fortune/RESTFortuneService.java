package com.code.springdemo.fortune;

import org.springframework.stereotype.Component;

//Specifying component name
@Component("restFortuneService")
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
