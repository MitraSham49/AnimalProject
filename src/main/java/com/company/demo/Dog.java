package com.company.demo;

public class Dog extends  Animal{
    public  Dog(){
        super();
        System.out.println("Now I am a dog!");
    }

    @Override
    public String sleep() {
        return "A dog sleeps...";
    }

    @Override
    public String eat() {
        return "A dog eats....";
    }
    public  String huff(){
        return"hupp.....";
    }

}
