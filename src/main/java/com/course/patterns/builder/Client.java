package com.course.patterns.builder;

import com.course.patterns.builder.director.MealDirector;
import com.course.patterns.builder.model.builder.FastFoodMealBuilder;
import com.course.patterns.builder.model.builder.FatMealBuilder;
import com.course.patterns.builder.model.builder.JustFriesBuilder;
import com.course.patterns.builder.model.builder.Menu1Builder;
import com.course.patterns.builder.model.builder.Menu2Builder;

public class Client {

    public static void order(String name, FastFoodMealBuilder builder) {
        System.out.println("Ordering a " + name);
        MealDirector director = new MealDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());

        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        order("Burguer", new Menu1Builder());
        order("Veggie Burguer", new Menu2Builder());
        order("Just Fries", new JustFriesBuilder());
        order("Heart Atack", new FatMealBuilder());
    }

}
