package com.kartik.packages;

public class Human {
    public String name;
    int age;
    int salary;
    boolean married;
    public static long population;

    public Human (String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}