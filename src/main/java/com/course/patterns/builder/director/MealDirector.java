package com.course.patterns.builder.director;

import com.course.patterns.builder.model.FastFoodMeal;
import com.course.patterns.builder.model.FastFoodMealBuilder;

public class MealDirector {

    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder){
        this.builder = builder;
    }

    public void constructCombo(){
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo(){
        return builder.getMeal();
    }

}
