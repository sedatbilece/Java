/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication26;



/**
 *
 * @author sedat
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashing reh=new Hashing();
       
        reh.Ekle("asd", 123); // 'a' ascii 97  97%20= 17
        reh.Ekle("asdx", 1234);  // 'a' ascii 97  97%20= 17
        
        reh.Ekle("Adem", 13579);  // 'A' ascii 65  65%20= 5
        reh.Ekle("Ademx", 135); // 'A' ascii 65  65%20= 5
        reh.Ekle("Bdemx", 45); // 'B' ascii 66  65%20= 6
        reh.Ekle("Adem", 13579);
        
        
        reh.Sil("Adem");
       
                
        reh.is_empty(0);
        
        
        
      //  reh.Arama("asdx");
        
        reh.Arama("asdx");
        
       // reh.Listele();// sadece nesneleri gösterir
        
        System.out.println("--------------------------------");
        
        
        reh.ListeleAll();// boş indisleride gösterir
    }
    
}
