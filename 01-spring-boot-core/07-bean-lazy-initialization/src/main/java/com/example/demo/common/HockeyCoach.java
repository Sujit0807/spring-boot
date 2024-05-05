package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

    public HockeyCoach() {
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice hockey for 15 minutes";
    }
}
