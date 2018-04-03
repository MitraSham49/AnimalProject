package com.company.demo;

public class SaberToothTiger extends Animal{
    public  SaberToothTiger(){
        super();
        System.out.println("Now I am a saber tooth tiger!");
    }

    @Override
    public String sleep() {
        return "A saber tooth tiger sleeps...";
    }

    @Override
    public String eat() {
        return "A saber tooth tiger eats....";
    }
    public  String tooth(){
        return"Have long tooth.....";
    }
}
