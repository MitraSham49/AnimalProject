package com.company.demo;

public class Monkey extends Animal {

    public Monkey() {
        super();
        System.out.println("Now I am a monkey!");
    }

    @Override
    public String sleep() {
        return "A monkey sleeps...";
    }

    @Override
    public String eat() {
        return "A monkey  eats....";
    }

    public String clim() {
        return "Climmm.....";
    }
}