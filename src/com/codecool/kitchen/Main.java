package com.codecool.kitchen;

public class Main {

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.hireStaff(10000);
        kitchen.distributeKnives();
        kitchen.distributeKnives();
        kitchen.reportTaxes();



        for (int i = 0; i < 5; i++) {
            kitchen.cookSomething(Kitchen.Ingredient.CARROT);
            kitchen.cookSomething(Kitchen.Ingredient.MEAT);
            kitchen.cookSomething(Kitchen.Ingredient.POTATO);
        }
    }
}
