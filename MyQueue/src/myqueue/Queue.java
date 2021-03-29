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
public class Queue {
    // list head and tail
    Node head;
    Node tail;
    
    
    public Queue(){
        head=null;
        tail=null;
    }
    
    
    public boolean is_Empty(){// list empty controller
        
        return head!=null;
    }
    
    public void EnQueue(int sayi){// node adding in the list tail
        
        Node node=new Node(sayi);
        
        
        if(is_Empty()){
            tail.next=node;
            tail=node;
        }
        else{
            head=node;
            tail=node;
        }
    }
    
    
    public void DeQueue(){//node removing in the list heading
        if(is_Empty()){
            if(head==tail){
                head=null;
                tail=null;
            }
            else{
                head=head.next;
            }
            
        }
    }
    
    
    public void Show(){// printing the list
        
        Node ptr=head;
        
        
        while(ptr!=null){
            System.out.print(ptr.sayi+" ");
            
            ptr=ptr.next;
        }
    }
    
    
}
