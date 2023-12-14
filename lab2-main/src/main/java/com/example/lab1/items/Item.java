package com.example.lab1.items;

public abstract class Item {
    private String name;
    private int height, width;

    public Item(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    // ...
}
