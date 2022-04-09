package com.course.patterns.fluent;

import com.course.patterns.fluent.model.FastFoodMeal;
import com.course.patterns.fluent.model.builder.FastFoodMealBuilder;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
            .andMain("CheeseBurguer")
            .forDrink("Coke")
        .thatsAll();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
        System.out.println(justFries);

        FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries")
            .andMain("Monster Burguer")
            .forDrink("Milk Shake")
            .andDessert("Fudge Cake")
            .andGift("2 Kilograms")
        .thatsAll();
        System.out.println(heartAtackCombo);
    }

}
