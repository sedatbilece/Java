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
public class BubbleSort {
    
    
      void Sort(int diz[])
    {
        int uz = diz.length;
        for (int i = 0; i < uz-1; i++)//n 
            
            for (int j = 0; j < uz-i-1; j++)// n* n   -->  O( n^2)
                
                if (diz[j] > diz[j+1])
                {
                    
                    int temp = diz[j];
                    diz[j] = diz[j+1];
                    diz[j+1] = temp;
                }
    }
}
