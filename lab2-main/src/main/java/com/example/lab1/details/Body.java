package com.example.lab1.details;

import com.example.lab1.items.Item;

public class Body extends Details {
    private Item item;
    private int height, width;

    public Body(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        if (height >= item.getHeight() && width >= item.getWidth()) {
            this.item = item;
        } else {
            throw new IllegalArgumentException("Item bigger than body");
        }
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
