package com.company.demo;

public class Fish extends Animal{
    public  Fish(){
        super();
        System.out.println("Now I am a fish!");
    }

    @Override
    public String sleep() {
        return "A fish sleeps...";
    }

    @Override
    public String eat() {
        return "A fish eats....";
    }
    public  String swim(){
        return"swimmmm.....";
    }
}
