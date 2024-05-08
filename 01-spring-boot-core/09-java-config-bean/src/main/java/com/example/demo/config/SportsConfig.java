package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.common.Coach;
import com.example.demo.common.SwimCoach;

@Configuration
public class SportsConfig {

  // @Bean // default bean id would be method name
  @Bean("acquatic") // custom bean id
  public Coach swimCoach() {
    return new SwimCoach(); // create instance of class
  }
}
