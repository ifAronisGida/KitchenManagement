package com.codecool.kitchen;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Helper extends Employee {

    private HashMap<Kitchen.Ingredient, Integer> inventory;
    private static int counter = 0;

    public Helper(int salary) {
        super("helper " + ++counter, salary);
        inventory = new HashMap<>();
        getRandomIngredients();
    }

    private void getRandomIngredients() {
        Random random = new Random();
        inventory.put(Kitchen.Ingredient.CARROT, random.nextInt(4));
        inventory.put(Kitchen.Ingredient.POTATO, random.nextInt(4));
        inventory.put(Kitchen.Ingredient.MEAT, random.nextInt(4));
    }

    public boolean checkForIngredient(Kitchen.Ingredient ingredient) {
        boolean gaveIngredient = false;
        for (Map.Entry<Kitchen.Ingredient, Integer> entry: inventory.entrySet()) {
            if (entry.getKey() == ingredient && entry.getValue() > 0) {
                entry.setValue(entry.getValue() - 1);
                gaveIngredient = true;
                System.out.println(name + ": here is some " + ingredient);
            }
        }
        return gaveIngredient;
    }

    public void saySorry(Kitchen.Ingredient ingredient) {
        System.out.println(name + ": SORRY MASTERCHEF WE'RE OUT OF " + ingredient);
    }
}
