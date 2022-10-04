package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sayHello();
        writeMessage("hi sedat");
        System.out.println( sum(5,8) );
        System.out.println( sum(5,8,10) );
    }

    static int sum(int x1,int x2){
        return x1+x2;
    }
    static int sum(int x1,int x2,int x3){
        return x1+x2+x3;
    }

    static void writeMessage(String msg){
        System.out.println(msg);
    }
    static void sayHello(){
        System.out.println("helllo !");
    }
}