package com.example.lab1.details;

import com.example.lab1.Car;

public abstract class Details {
    private Car car;

    public Details() {
    }

    public Details(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
