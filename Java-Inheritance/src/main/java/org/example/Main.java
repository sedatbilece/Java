package org.example;

public class Main {
    public static void main(String[] args) {
              Child child =new Child();
              child.x=10;
              child.y=20;
        System.out.printf("%d %d",child.x,child.y);
    }
}
class Child extends Parent{
    public int y;
}
class Parent {
    public int x;
}