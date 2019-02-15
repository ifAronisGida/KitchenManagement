package com.codecool.kitchen;

public class Main {

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.hireStaff(10000);
        kitchen.distributeKnives();

        for (int i = 0; i < 4; i++) {
            kitchen.cookSomething(Kitchen.Ingredient.CARROT);
            kitchen.cookSomething(Kitchen.Ingredient.MEAT);
            kitchen.cookSomething(Kitchen.Ingredient.POTATO);

        }
    }
}
