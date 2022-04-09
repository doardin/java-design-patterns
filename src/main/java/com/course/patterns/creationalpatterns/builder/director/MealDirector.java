package com.course.patterns.creationalpatterns.builder.director;

import com.course.patterns.creationalpatterns.builder.model.FastFoodMeal;
import com.course.patterns.creationalpatterns.builder.model.builder.FastFoodMealBuilder;

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
