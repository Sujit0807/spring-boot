package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Coach;

@RestController
public class DemoController {

  private Coach myCoach;

  @Autowired
  public DemoController(@Qualifier("cricketCoach") Coach myCoach) {
    this.myCoach = myCoach;

    System.out.println("Constructor: " + getClass().getSimpleName());
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

}
