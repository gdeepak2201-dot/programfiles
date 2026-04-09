package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * The entry point of your Spring Boot application.
 * @EnableCaching: Activates the caching layer (Caffeine).
 * @EnableScheduling: Allows us to run background tasks (like refreshing weather).
 */
@SpringBootApplication
@EnableCaching
@EnableScheduling
public class DemoApplication {

    public static void main(String[] args) {
        // This line launches the embedded Tomcat server on port 8080
        SpringApplication.run(DemoApplication.class, args);

        System.out.println("--------------------------------------");
        System.out.println("Weather Dashboard is running!");
        System.out.println("Test it at: http://localhost:8080/api/weather?city=London");
        System.out.println("--------------------------------------");
    }
}