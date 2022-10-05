package org.example;

import org.classes.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee emp =new Employee("Sedat");
        emp.setName("asd");
        Employee emp2=new Employee("s2");
        emp2.incCount();
        System.out.println(emp.incCount());
        System.out.println(emp.getName());
    }
}