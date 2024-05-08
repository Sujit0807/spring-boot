package com.example.demo.common;

public class SwimCoach implements Coach {

  public SwimCoach() {
    System.out.println("Constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Swim for 1 hour!";
  }

}
