package com.example.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.example.lab1.details.Details;

public class Car {
    private String name;
    private Details body;
    private Details wheels;
    private Details cabin;
    private Details engine;

    public Car() {
        System.out.println("Car bean is created");
    }

    public String getName() {
        return name;
    }

    @Value("${car.name}")
    public void setName(String name) {
        this.name = name;
    }

    public Details getBody() {
        return body;
    }

    @Autowired
    @Qualifier("body")
    public void setBody(Details body) {
        this.body = body;
    }

    public Details getWheels() {
        return wheels;
    }

    @Autowired
    @Qualifier("wheels")
    public void setWheels(Details wheels) {
        this.wheels = wheels;
    }

    public Details getCabin() {
        return cabin;
    }

    @Autowired
    @Qualifier("cabin")
    public void setCabin(Details cabin) {
        this.cabin = cabin;
    }

    public Details getEngine() {
        return engine;
    }

    @Autowired
    @Qualifier("engine")
    public void setEngine(Details engine) {
        this.engine = engine;
    }

}
