/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication36;

/**
 *
 * @author sedat
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int uz=100000;
       int [] dizi=new int[uz];
       
       for(int i=0;i<uz;i++){
           
           dizi[i]=(int)Math.random()*1000;
           
       }
       
       
       BubbleSort bb=new BubbleSort();
       long st=System.nanoTime();
       bb.Sort(dizi);
       
       long ft=System.nanoTime();
       
       long tt=ft-st;
       
       
       System.out.println("nanosaniye: "+tt);
       
       System.out.println("milisaniye:"+ tt/(Math.pow(10, 6)));
       
        
      
        
        
       
    }
    
}
