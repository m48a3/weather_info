package com.example.weather_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.weather_info.domain")
@EnableJpaRepositories(basePackages = "com.example.weather_info.repos")
public class WeatherInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherInfoApplication.class, args);
    }

}
