package com.example.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // component annotation will make it available for scanning and spring boot will automatically create object/bean
@Primary // this will be primary implementation for coach if not specified which implementation to use
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
