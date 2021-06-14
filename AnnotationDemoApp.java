package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/code/springdemo/applicationContext.xml");

        ICoach theICoach = context.getBean("tennisCoach", ICoach.class);
        System.out.println(theICoach.getDailyWorkout());
        System.out.println(theICoach.getDailyFortune());

        context.close();
    }
}
