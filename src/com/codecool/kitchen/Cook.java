package com.codecool.kitchen;


public class Cook extends Cooker{

    private static int counter = 0;

    public Cook(int salary) {
        super("COOK " + ++counter, salary * 2);
    }

    @Override
    public void cook(Kitchen.Ingredient ingredient) {
        System.out.println(name + ": cooking " + ingredient);
    }
}
