package com.course.patterns.creationalpatterns.builder.model.builder;

public class Menu2Builder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Water");
    }

    @Override
    public void buildMain() {
        meal.setMain("VeggieBurguer");
    }

    @Override
    public void buildSide() {
        meal.setSide("Salad");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Apple");
    }

    @Override
    public void buildGift() {
        meal.setGift("I'm Veggie's Stamp");
    }

}
