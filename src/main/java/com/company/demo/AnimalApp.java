package com.company.demo;

import static jdk.nashorn.internal.objects.Global.print;

public class AnimalApp {
    public static void main(String[]args){
      /* Animal a = new Animal("overloaded constructor has run");
        a.setName("Yogi Bear");
        System.out.println("The animal is called "+ a.getName());
        System.out.printf(a.eat());
        System.out.printf(a.sleep());
        Animal b = new Animal();
        b.setName("Smokey the Bear");
        System.out.println("The animal is called "+ b.getName());
        System.out.printf(b.eat());
        System.out.printf(b.sleep());
       */
      Animal a = new Animal();
      print(a.eat());
      print(a.sleep());

       Cat c = new Cat();
       print(c.eat());
       print(c.sleep());
       print(c.purr());

       Bird b= new Bird();
       print(b.eat());
       print(b.sleep());
       print(b.fly());
    }
    private  static  void print (String s){
        System.out.println(s);
    }
}
