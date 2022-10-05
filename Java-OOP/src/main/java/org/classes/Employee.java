package org.classes;

public class Employee {
     private String name;
     private static int count=0;// common  for all object
    public Employee(String name){//constructor
        this.name =name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
         this.name=name;
    }
    public int incCount(){
        return count+=1;
    }
}
