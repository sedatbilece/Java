package org.example;

import java.util.Scanner;

/**
 * While num not be  0 sum integers if num 0 end to while loop
 */
public class Main {
    public static void main(String[] args) {

        Scanner kb =new Scanner(System.in);

        System.out.println("Start entering number");

        int sum=0;
        int num;

        while( (num=Integer.parseInt(kb.nextLine())) !=0){
                sum+=num;

            System.out.printf("Sum : %d \n",sum);

        }
    }
}