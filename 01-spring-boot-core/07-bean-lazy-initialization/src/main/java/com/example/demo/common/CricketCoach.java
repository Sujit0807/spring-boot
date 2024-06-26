package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy // Lazy annotation will create bean/object when required not at start -> FOR
      // GLOBALLY WE CAN SETUP IN APPLICATION PROPERTIES FILE -> Also applied for controller classes
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
