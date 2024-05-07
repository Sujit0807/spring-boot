package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    
    public TennisCoach() {
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice tennis for 15 minutes";
    }
}
