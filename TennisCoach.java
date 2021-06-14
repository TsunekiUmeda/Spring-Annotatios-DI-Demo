package com.code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

    //Field injection
    @Autowired
    //bean name to inject
    @Qualifier("fileFortuneService")
    private IFortuneService IFortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    /*
        //Constructor injection
        @Autowired
        public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
            this.fortuneService = fortuneService;
        }

        Setter Injection
        @Autowired
        public void setFortuneService(FortuneService fortuneService) {
            System.out.println(">> TennisCoach: inside setFortuneService method");
            this.fortuneService = fortuneService;
        }
            */
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return IFortuneService.getFortune();
    }
}
