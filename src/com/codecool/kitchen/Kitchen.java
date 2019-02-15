package com.codecool.kitchen;

import java.util.ArrayList;

public class Kitchen {

    private ArrayList<Employee> employees;
    private ArrayList<Helper> helpers;
    private ArrayList<Cook> cooks;
    private Chef chef;

    public Kitchen() {
        employees = new ArrayList<>();
        helpers = new ArrayList<>();
        cooks = new ArrayList<>();
    }

    public enum Ingredient {
        CARROT,
        POTATO,
        MEAT
    }

    public void hireStaff(int baseSalary) {
        for (int i = 0; i < 2; i++) {
            cooks.add(new Cook(baseSalary));
            helpers.add(new Helper(baseSalary));
        }
        chef = new Chef(baseSalary, helpers, cooks);
    }

    public void distributeKnives() {
        chef.getWorkKnife();
        for (Cook cook: cooks) {
            cook.getWorkKnife();
        }
    }

    public void cookSomething(Ingredient ingredientToCook) {
        chef.cook(ingredientToCook);
    }
}
