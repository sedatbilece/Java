package org.test2;

public class Animal {
    protected int legCount;

    Animal(String str){
        System.out.printf("hello  str: %s \n",str);
    }
    void makeVoice(){
        System.out.println("this is a interface");
    }

    void eat(){
        System.out.println("eating");
    }
}
