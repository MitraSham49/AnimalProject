package com.company.demo;

public class Animal {
    private  String name;

    /*public Animal(String name) {
        this.name = name;
    }
    */
    //this is the default constructor
    public Animal() {
        System.out.println("An animal has been created");
    }
    //this is overload  constructor
    public Animal(String message) {
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public String eat(){
        return "An animal eats....";

     }
    public String sleep(){
        return "An animal sleep....";

    }
}
