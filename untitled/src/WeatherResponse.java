package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherResponse(String name, MainDetails main, List<WeatherDesc> weather) {}

record MainDetails(double temp, int humidity) {}
record WeatherDesc(String description) {}