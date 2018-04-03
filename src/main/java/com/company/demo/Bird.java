package com.company.demo;

public class Bird  extends Animal{
    public  Bird(){
        System.out.println("Abird is hatched");
    }

    @Override
    public String sleep() {
        return "A bird sleeps soundly....";
    }

    @Override
    public String eat() {
        return "A bird eats....";
    }


    public String fly() {
        return "a bird flies....";
    }
}
