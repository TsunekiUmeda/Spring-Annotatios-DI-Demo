package com.code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.code.springdemo")
public class SportConfig {

    //define bean for out sad fortune service
    @Bean
    public IFortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for out swim coach AND inject dependency
    @Bean
    public ICoach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
