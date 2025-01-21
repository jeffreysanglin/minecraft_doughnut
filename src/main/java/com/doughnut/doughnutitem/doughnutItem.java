package com.doughnut.doughnutitem;

import com.doughnut.doughnutitem.list.FoodList;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class doughnutItem {
    public static Item register(Item item, RegistryKey<Item> registryKey) {
        // Register the item.
        Item registeredItem;
        registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);

        // Return the registered item!
        return registeredItem;
    }

    public static final RegistryKey<Item> DOUGHNUT_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Doughnut.MOD_ID, "doughnut"));
    public static final Item DOUGHNUT = register(
            new Item(new Item.Settings().registryKey(DOUGHNUT_KEY).food(FoodList.EXAMPLE_FOOD_COMPONENT)),
            DOUGHNUT_KEY
    );

    public static void initialize(){
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(doughnutItem.DOUGHNUT));
    }
}
