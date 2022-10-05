package org.example;

import java.util.Arrays;

public class Reference {

    int[] notes;
    boolean[] isActive;
    String message;
    public static void main(String[] args) {

        Reference reference =new Reference();

        System.out.println(reference.notes);
        System.out.println(reference.isActive);
        System.out.println(reference.message);

          int[] school ={5,4,3,2,1};
        System.out.println(Arrays.toString(school));

        int[] highschool=school;
        System.out.println(Arrays.toString(highschool));

        school[0]=0;
        System.out.println(Arrays.toString(highschool));// highschool changed


        int a=5;
        int b=5;
        System.out.println(a==b);//true

        Reference reference1 =new Reference();reference1.message="hello";
        Reference reference2 =new Reference();reference2.message="hello";
        System.out.println(reference1==reference2);//false
        System.out.println(reference1.equals(reference2));
    }
}
