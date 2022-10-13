package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        sum(5,3);
          sum("6","11");
          sum("x",4,9);
         */


          Employee employee = new Employee("sedat");
          employee.work();
        System.out.println(employee.calSalary());

        Engineer engineer= new Engineer("sedat2");
        engineer.work();
        System.out.println(engineer.calSalary());


        Employee employee2 = new Engineer("sedat3");//downcasting
        ((Engineer) employee2).someDo();

        /* HATA AKINIR
        Employee employee3 = new Employee("sedat4");//downcasting
        ((Engineer) employee3).someDo(); */


    }
    public static void sum (int a,int b){
        System.out.println(a+b);
    }
    public static void sum (String a,String b){
        System.out.println(a+b);
    }
    public static void sum (String c, int a,int b){
        System.out.println(c+": "+(a+b ));
    }


}