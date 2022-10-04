package org.example;

public class Main {
    public static void main(String[] args) {
        int i1=5;
        double d1=5.2;
        i1= (int) d1;
        System.out.println(i1);//5


        int i2=10;
        double d2=i2;
        System.out.println(d2);//10.0


        int ch1='A';
        int i3=ch1;
        System.out.println(i3);//65

        float f1=65f;
        char ch2 = (char) f1;
        System.out.println(ch2);//A

        int fah =120;
        int cel = (int) ((fah-32)*5.0/9.0);//int*double =double
        System.out.println(cel);//48


        float f2 = 128f;
        char ch3 = (char) f2;
        System.out.println(ch3);

        int i4 = 20005 ;// 1001110 0010 0101 1+4+32 sondaki 8 bitten 37 gelir
        byte b1= (byte) i4;
        System.out.println(b1);//37

        int i5=65;
        //String str1= String.valueOf(i5);
        //String str1 = Integer.toString(i5);
        String str1 =""+i5;
        System.out.println(str1);

        String str2="5";
        int i6=Integer.parseInt(str2);
        System.out.println(i6);
    }
}