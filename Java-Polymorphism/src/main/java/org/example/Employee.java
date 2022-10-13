package org.example;

public class Employee {

    public static final int MIN_WAGE=4000;

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println(name+" is working ...");
    }

    public int calSalary(){
        return MIN_WAGE;
    }

}
