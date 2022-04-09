package com.course.patterns.builder.model;

public class JustFriesBuilder extends FastFoodMealBuilder {

    @Override
    public void buildSide() {
        meal.setSide("Large Fries");
    }

}
