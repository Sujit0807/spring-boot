package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Coach;

@RestController
public class DemoController {

  private Coach myCoach;

  @Autowired
  public DemoController(Coach myCoach) {
    // as we specified primary implementation -> if we don't specify it will take
    // primary as default
    this.myCoach = myCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

}
