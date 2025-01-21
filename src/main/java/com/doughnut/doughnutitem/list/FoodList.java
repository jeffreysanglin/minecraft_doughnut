package com.doughnut.doughnutitem.list;

import net.minecraft.component.type.FoodComponent;

public class FoodList {
    public static final FoodComponent EXAMPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.3F)
            .alwaysEdible()
            .build();
}
