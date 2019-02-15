package com.codecool.kitchen;

import java.util.Date;

public abstract class Employee {

    protected String name;
    protected int birthYear;
    protected int salary;
    private static int counter = 0;

    public Employee(String name, int salary) {
        this.name = name;
        this.birthYear = 1960 + ++counter;
        this.salary = salary;
    }

    protected void createTaxReport() {
        System.out.println(name + ": I have to pay " + salary * 0.99 + " money to our beloved government for keeping me safe!!");
    }
}
