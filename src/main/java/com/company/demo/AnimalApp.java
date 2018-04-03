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

        Dog d= new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.huff());

        Fish e= new Fish();
        print(e.eat());
        print(e.sleep());
        print(e.swim());

        Monkey f= new Monkey();
        print(f.eat());
        print(f.sleep());
        print(f.clim());

        Unicorn h= new Unicorn();
        print(h.eat());
        print(h.sleep());
        print(h.corn());
        h.setName("Blue");


        SaberToothTiger g= new SaberToothTiger();
        print(g.eat());
        print(g.sleep());
        print(g.tooth());


    }
    private  static  void print (String s){
        System.out.println(s);
    }
}
