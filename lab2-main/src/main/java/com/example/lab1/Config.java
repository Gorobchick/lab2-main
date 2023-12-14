package com.example.lab1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.lab1.details.Body;
import com.example.lab1.details.Cabin;
import com.example.lab1.details.Engine;
import com.example.lab1.items.Crank;
import com.example.lab1.items.Item;

@Configuration
@PropertySource("classpath:application.properties")
public class Config {
    @Value("$(hatchback.height)")
    int hatchbackHeight;

    @Value("$(hatchback.width)")
    int hatchbackWidth;

    @Value("$(sedan.height)")
    int sedanHeight;

    @Value("$(sedan.width)")
    int sedanWidth;

    @Value("$(crank.height)")
    int crankHeight;

    @Value("$(crank.width)")
    int crankWidtht;

    @Value("$(crank.name)")
    String crankName;

    @Value("$(engine.pistons)")
    int enginePistons;

    @Value("$(engine.volume)")
    double engineVolume;

    @Value("$(cabin.seats)")
    int cabinSeats;

    @Bean
    public Body hatchback() {
        return new Body(hatchbackHeight, hatchbackWidth);
    }

    @Bean
    public Body sedan() {
        var body = new Body(sedanHeight, sedanWidth);
        body.setItem(crank());
        return body;
    }

    @Bean
    public Item crank() {
        return new Crank(crankName, crankWidtht, crankHeight);
    }

    @Bean
    Engine engine() {
        return new Engine(enginePistons, engineVolume);
    }

    @Bean
    Cabin cabin() {
        return new Cabin(cabinSeats);
    }
}
