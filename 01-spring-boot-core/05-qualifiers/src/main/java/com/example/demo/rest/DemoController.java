package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Coach;

@RestController
public class DemoController {

  private Coach myCoach;

  // need to add qualifier coz -> we have multiple implementation of coach -> to
  // specify which to use, we use qualifier
  @Autowired
  public DemoController(@Qualifier("tennisCoach") Coach myCoach) { // first character of className should be lowerCase
    this.myCoach = myCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

}
