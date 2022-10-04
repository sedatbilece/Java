package org.example2;

import java.util.Scanner;

public class Main {
// psvm+tab do main classes
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);

        System.out.println("Start entering number");

        int possum=0;
        int negsum=0;
        int num;

        while( (num=Integer.parseInt(kb.nextLine())) !=0){

             if(num>0){
                 possum+=num;
             } else if (num <0) {
                 negsum+=num;
             }
            System.out.println(" enter a number :");
        }
              displayResult(possum,negsum);

    }

    public static void displayResult(int sum1,int sum2){
        System.out.println("Positive Numbers's sum : "+sum1);
        System.out.println("Negative Numbers's sum : "+sum2);
    }


}
