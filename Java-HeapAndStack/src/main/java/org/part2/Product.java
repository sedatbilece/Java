package org.part2;

public class Product {

    // instance variables
    int id;
    String name;


    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public static Product builder(int id,String name){
        return new Product(id,name);
    }


    public static void main(String[] args) {

        int id=12;
        String name="sedat";

        Product prd=null;
        prd = builder(id,name);
    }

}
