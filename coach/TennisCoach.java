package com.code.springdemo.coach;

import com.code.springdemo.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    //Field injection
    @Autowired
    //bean name to inject
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    //destroy method
    @PreDestroy
    public void destroy() {
        System.out.println(">> TennisCoach: inside of destroy()");

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
        return fortuneService.getFortune();
    }
}
