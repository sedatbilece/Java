/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myqueue;

/**
 *
 * @author sedat
 */
public class MyQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Queue qe=new Queue();
        
        qe.EnQueue(10);
         qe.EnQueue(20);
          qe.EnQueue(30);
           qe.EnQueue(40);
           
           
           qe.DeQueue();
           qe.EnQueue(50);
        qe.Show();
    }
    
}
