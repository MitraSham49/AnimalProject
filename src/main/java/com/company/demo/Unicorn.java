package com.company.demo;

public class Unicorn extends Animal{
    public  Unicorn(){
        super();
        System.out.println("Now I am a unicorn!");
    }

    @Override
    public String sleep() {
        return "A unicorn sleeps...";
    }

    @Override
    public String eat() {
        return "A unicorn  eats....";
    }


    public  String corn(){
        return"Have horn.....";
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        System.out.println("My name is: "+ super.getName()+ " I am magical");
    }
}
