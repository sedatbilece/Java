package org.statics;

public class Suv {

    int carKm;
    String name;

    static String carType="SUV";
    //common for all object


    static void print(){
       // this.carKm; //can not use this in static method
        System.out.println(carType);
    }
    public void value(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {

        Suv suv = new Suv();

        System.out.println(suv.carType);
        System.out.println(Suv.carType);//best practice
        System.out.println(carType);


        // static vs dynamic methods
        suv.value("Honda");
        print();



    }
}
