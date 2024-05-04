package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Coach;

@RestController
public class DemoController {
  // define a private field for dependency
  private Coach myCoach;

  // define a setter method for dependency injection
  @Autowired
  public void setMyCoach(Coach myCoach) {
    this.myCoach = myCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

}
