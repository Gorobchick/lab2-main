package com.example.lab1.details;

public class Engine extends Details {
    private int piston;
    private double volume;

    public Engine(int piston, double volume) {
        this.piston = piston;
        this.volume = volume;
    }

    public int getPiston() {
        return this.piston;
    }

    public void setPiston(int piston) {
        this.piston = piston;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}
