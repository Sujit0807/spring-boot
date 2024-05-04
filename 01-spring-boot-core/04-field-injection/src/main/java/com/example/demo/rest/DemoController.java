package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Coach;

@RestController
public class DemoController {
  // field injection -> this is not recommended now
  @Autowired
  private Coach myCoach;

  // no need to define constructor/setter injection 

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

}
