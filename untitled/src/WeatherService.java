package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WeatherService {
    private final WebClient webClient;
    private final String API_KEY = "YOUR_API_KEY_HERE"; // Put your key from OpenWeatherMap

    public WeatherService(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://api.openweathermap.org/data/2.5").build();
    }

    @Cacheable(value = "weatherCache", key = "#city")
    public WeatherResponse fetchWeather(String city) {
        System.out.println(">>> API CALL MADE FOR: " + city);
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/weather")
                        .queryParam("q", city)
                        .queryParam("appid", API_KEY)
                        .queryParam("units", "metric")
                        .build())
                .retrieve()
                .bodyToMono(WeatherResponse.class)
                .block(); // block() is okay for this intermediate project
    }
}