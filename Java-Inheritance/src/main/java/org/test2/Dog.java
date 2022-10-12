package org.test2;

public class Dog  extends Animal{


    Dog(){
       super("dog ctor");//super is animal constructor
    }


    void makeVoice() {
        System.out.println("dog havhav");
    }

    void bark(){
        this.legCount=5;
        this.eat();
        System.out.println("barking ..");
        }
     }

