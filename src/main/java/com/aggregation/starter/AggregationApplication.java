package com.aggregation.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.aggregation")
@SpringBootApplication
public class AggregationApplication {

  public static void main(String[] args) {
    System.setProperty("spring.config.location", "/config");
    System.setProperty("spring.config.name", "config");
    SpringApplication.run(AggregationApplication.class, args);
  }
}
