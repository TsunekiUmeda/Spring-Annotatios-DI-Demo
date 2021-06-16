package com.code.springdemo.config;

import com.code.springdemo.coach.Coach;
import com.code.springdemo.coach.SwimCoach;
import com.code.springdemo.fortune.FortuneService;
import com.code.springdemo.fortune.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.code.springdemo")
public class SportConfig {

    //define bean for out sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for out swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
