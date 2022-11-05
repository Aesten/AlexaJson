package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum FoodCategoryEnum {
    BEEF, BEVERAGE, CHICKEN, FISH, MEAT, PIZZA, POPCORN, PORK, POTATO, SHRIMP, SOUP, STEAK, TURKEY, VEGETABLE, WATER;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case BEEF -> "BEEF";
            case BEVERAGE -> "BEVERAGE";
            case CHICKEN -> "CHICKEN";
            case FISH -> "FISH";
            case MEAT -> "MEAT";
            case PIZZA -> "PIZZA";
            case POPCORN -> "POPCORN";
            case PORK -> "PORK";
            case POTATO -> "POTATO";
            case SHRIMP -> "SHRIMP";
            case SOUP -> "SOUP";
            case STEAK -> "STEAK";
            case TURKEY -> "TURKEY";
            case VEGETABLE -> "VEGETABLE";
            case WATER -> "WATER";
        };
    }

    @JsonCreator
    public static FoodCategoryEnum forValue(String value) throws IOException {
        if (value.equals("BEEF")) return BEEF;
        if (value.equals("BEVERAGE")) return BEVERAGE;
        if (value.equals("CHICKEN")) return CHICKEN;
        if (value.equals("FISH")) return FISH;
        if (value.equals("MEAT")) return MEAT;
        if (value.equals("PIZZA")) return PIZZA;
        if (value.equals("POPCORN")) return POPCORN;
        if (value.equals("PORK")) return PORK;
        if (value.equals("POTATO")) return POTATO;
        if (value.equals("SHRIMP")) return SHRIMP;
        if (value.equals("SOUP")) return SOUP;
        if (value.equals("STEAK")) return STEAK;
        if (value.equals("TURKEY")) return TURKEY;
        if (value.equals("VEGETABLE")) return VEGETABLE;
        if (value.equals("WATER")) return WATER;
        throw new IOException("Cannot deserialize FoodCategoryEnum");
    }
}
