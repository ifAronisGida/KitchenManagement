package com.codecool.kitchen;


public abstract class Cooker extends Employee {

    protected boolean hasKnife;

    public Cooker(String name, int salary) {
        super(name, salary);
        this.hasKnife = false;
    }

    public abstract void cook(Kitchen.Ingredient ingredient);

    public void getWorkKnife() {
        if (!hasKnife) {
            hasKnife = true;
            System.out.println(name + ": thanks for the awesome knife!");
        }
        else System.out.println("already got knife");
    }

}
