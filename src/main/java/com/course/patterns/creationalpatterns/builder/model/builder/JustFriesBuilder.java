package com.course.patterns.creationalpatterns.builder.model.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {

    @Override
    public void buildSide() {
        meal.setSide("Large Fries");
    }

}
