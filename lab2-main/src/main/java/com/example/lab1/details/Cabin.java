package com.example.lab1.details;

public class Cabin extends Details {
    private int seat;

    public Cabin(int seat) {
        this.seat = seat;
    }

    public int getSeat() {
        return this.seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

}
