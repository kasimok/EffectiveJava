package com.evilisn.builder;

public class NutritionFactsBuilder {
    //Required
    private final int servingSizes;
    private final int servings;
    //Optional
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFactsBuilder(int servings, int servingSizes) {
        this.servings = servings;
        this.servingSizes = servingSizes;
    }


    public NutritionFactsBuilder setCalories(int calories) {
        this.calories = calories;
        return this;
    }

    public NutritionFactsBuilder setFat(int fat) {
        this.fat = fat;
        return this;
    }

    public NutritionFactsBuilder setSodium(int sodium) {
        this.sodium = sodium;
        return this;
    }

    public NutritionFactsBuilder setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
        return this;
    }

    public NutritionFacts createNutritionFacts() {
        return new NutritionFacts(servingSizes, servings, calories, fat, sodium, carbohydrate);
    }
}