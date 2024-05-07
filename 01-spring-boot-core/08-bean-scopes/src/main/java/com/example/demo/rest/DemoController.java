package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Coach;

@RestController
public class DemoController {

  private Coach myCoach;
  private Coach anotherCoach;

  // by default Scope of bean is SINGLETON -> i.e only one instance of class created
  @Autowired
  public DemoController(@Qualifier("cricketCoach") Coach myCoach, @Qualifier("cricketCoach") Coach otherCoach) { 
    // default scope SINGLETON -> Both instance will point to same object in memory
    this.myCoach = myCoach;
    this.anotherCoach = otherCoach;

    System.out.println("Constructor: " + getClass().getSimpleName());
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

  @GetMapping("/check")
  public String check() {
    // FOR SINGLETON => TRUE
    // FOR PROTOTYPE => FALSE
    return "Comparing beans: myCoach == anotherCoach: " + (myCoach == anotherCoach);
  }

}
