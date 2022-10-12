package org.test2;

public class Main {
    public static void main(String[] args) {
       Dog dog=new Dog();
        Cat cat = new Cat();
        Vasak vasak =new Vasak();

       dog.bark();
       dog.legCount=10;
        System.out.printf("%d \n", dog.legCount);


        dog.makeVoice();//from dog
        cat.makeVoice();//from cat
        vasak.makeVoice();//from cat

        dog.eat();//from animal
        cat.eat();//from animal
        vasak.eat();//from animal
    }
}
