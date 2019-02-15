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
        for (int i = 0; i < 3; i++) {
            Helper helper = new Helper(baseSalary);
            helpers.add(helper);
            employees.add(helper);
        }
        for (int i = 0; i < 2; i++) {
            Cook cook = new Cook(baseSalary);
            cooks.add(cook);
            employees.add(cook);
        }
        chef = new Chef(baseSalary, helpers, cooks);
        employees.add(chef);
    }

    public void distributeKnives() {
        chef.getWorkKnife();
        for (Cook cook: cooks) {
            cook.getWorkKnife();
        }
    }

    public void reportTaxes() {
        for (Employee employee: employees) {
            employee.createTaxReport();
        }
    }

    public void cookSomething(Ingredient ingredientToCook) {
        chef.cook(ingredientToCook);
    }
}
