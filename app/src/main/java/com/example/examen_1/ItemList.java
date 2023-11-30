package com.example.examen_1;

// ListItem.java
public class ItemList {

    private final String text;
    private final int imageResId;

    public ItemList(String text, int imageResId) {
        this.text = text;
        this.imageResId = imageResId;
    }

    public String getText() {
        return text;
    }

    public int getImageResId() {
        return imageResId;
    }
}

