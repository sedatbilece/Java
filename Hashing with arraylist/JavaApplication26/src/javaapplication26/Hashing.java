/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication26;

import java.util.ArrayList;

/**
 *
 * @author sedat
 */
public class Hashing {
     ArrayList<Node> rehber = new ArrayList<>();// arraylist içinde Node tutuyoruz
    
    public Hashing(){// arraylist oluşturuluyor
        Node nd=new Node("",0);
          for (int i=0;i<20;i++){
           rehber.add(i, nd);
}
          
    }
    
    
        

     /**
      * 
      * @param Ad modu istenen kelime
      * @return  kelimenin modu döndürülür
      */
   public int getHasCode(String Ad){
       
       int hascode=  (int)Ad.charAt(0);// stringin ilk karakteri alınıp inte çeviriliyor
         
       int hascodex = hascode%20; //mod alınıyor
       
       return hascodex;
     }
   
   
   /**
    * belirtilen elemanın boş olup olmadığı
    * 
    * @param indis 
    * @return 
    */
    public boolean is_empty(int indis){
         
         Node nl=rehber.get(indis);
         
         return nl.Numara==0;
         
         
     }
    
    /**
     * rehberdeki numaraları yazdırır
     */
     public void Listele(){
         
         for (int i=0;i<20;i++){
             
             Node nd=rehber.get(i);
             
             if(!is_empty(i)){
                 System.out.println(" ad:"+nd.Ad+" num:"+nd.Numara);
             System.out.println("*************");
             }
             
         }
         
     }
     
     /**
     * tüm rehberi yazdırır
     */
     public void ListeleAll(){
         
         for (int i=0;i<20;i++){
             
             Node nd=rehber.get(i);
             
             System.out.println(i+") indis:"+nd.indis+" ad:"+nd.Ad+" num:"+nd.Numara);
             System.out.println("*************");
             
         }
         
     }
    
  
    /**
     * verilen numara ve adları ad moduna göre listeye yerleştirir
     * çakışma durumunda indisden sonraki elemanları kontrol ederek uygun boşluğa yerleştirir
     * 
     * @param Ad
     * @param Numara 
     */
     public void Ekle(String Ad,int Numara){
         Node nd=new Node(Ad,Numara);
         nd.Ad=Ad;
         nd.Numara=Numara;
        nd.indis = getHasCode(Ad);
         
        if(is_empty(nd.indis)){//modun indisi boş ise
            rehber.add(nd.indis, nd);
        }
        else{//modun indisi dolu ise 
            for(int i=nd.indis+1;i<20;i++){//indisten sonraki boşluğu arar ve oraya yerleştirir
                
               if(is_empty(i)){
                   rehber.add(i,nd);
                   break;
               } 
                
            }
            
        }
        
         
     }
     
     
     /**
      * silinecek eleman mod indisinde olabilir veya ondan sonraki herhangi bir indiste
      * 
      * @param Ad 
      */
     public void Sil(String Ad){
         Node tmp=new Node();
         
         int ind=getHasCode(Ad);
         tmp=rehber.get(ind);
         
         if(tmp.Ad.equals(Ad)){// modun indisindemi kontrolü
             rehber.remove(ind);
             
         }
         else{//eklemedeki aynı işlemler
             for(int i=ind+1;i<rehber.size();i++){
                 
                 tmp=rehber.get(i);
                         
                 if(tmp.Ad.equals(Ad)){
                     
                  rehber.remove(i);
                  break;  
          
         }
                 
             }
         }
         
         
         
     }
     
     /**
      * 
      * @param Ad 
      */
     public void Arama(String Ad){// ekleme ve silmedekine benzeyen aynı işlemler
         
         Node tmp=new Node();
         int cnt=0;
         int ind=getHasCode(Ad);
         tmp=rehber.get(ind);
         
         if(tmp.Ad.equals(Ad)){
             
             System.out.println(" ad:"+tmp.Ad+" num:"+tmp.Numara);
             cnt+=1;
         }
         else{
             for(int i=ind+1;i<rehber.size();i++){
                 
                 tmp=rehber.get(i);
                         
                 if(tmp.Ad.equals(Ad)){
                   cnt+=1;  
                   System.out.println(" ad:"+tmp.Ad+" num:"+tmp.Numara);
                  break;  
          
         }
                 
             }
         }
         
         if(cnt==0){
             System.out.println("Aranan İsimde biri bulunamadı ");
         }
         
     }
     
     
     
     
    
     
     
    
     
     
     
     
    
    
    
    
    
    
}
