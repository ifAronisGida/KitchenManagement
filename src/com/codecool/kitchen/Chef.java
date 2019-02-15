package com.codecool.kitchen;

import java.util.ArrayList;
import java.util.Random;

public class Chef extends Cooker {

    private Kitchen.Ingredient ingredient;
    private ArrayList<Helper> helpers;
    private ArrayList<Cook> cooks;
    private static int counter = 0;

    public Chef(int salary, ArrayList<Helper> helpers, ArrayList<Cook> cooks) {
        super("MasterChef " + ++counter, salary * 3);
        this.helpers = helpers;
        this.cooks = cooks;
    }

    private void yellAtHelpers(Kitchen.Ingredient ingredient) {
        int counter = 0;
        for (Helper helper: helpers) {
            if (helper.checkForIngredient(ingredient)) {
                this.ingredient = ingredient;
                return;
            }
            else counter++;
        }
        if (counter >= helpers.size()) {
            for (Helper helper: helpers) {
                helper.saySorry(ingredient);
            }
        }
    }

    private Cook getRandomCook() {
        Random random = new Random();
        return cooks.get(random.nextInt(cooks.size()));
    }

    @Override
    public void cook(Kitchen.Ingredient ingredient) {
        this.ingredient = null;
        yellAtHelpers(ingredient);
        if (this.ingredient != null) {
            getRandomCook().cook(ingredient);
        }
    }
}
