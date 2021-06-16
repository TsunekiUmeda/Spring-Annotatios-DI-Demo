package com.code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        ICoach theICoach = context.getBean("tennisCoach", ICoach.class);
        System.out.println(theICoach.getDailyWorkout());
        System.out.println(theICoach.getDailyFortune());

        context.close();
    }
}
