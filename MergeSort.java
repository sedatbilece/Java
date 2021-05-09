

package hw6_soru1;

/**
 *
 * @author sedat
 */

class MergeSort
{
    /**
     * burada kontroller ve verilen parçaların sıralanması yapılmakta
     * 
     * 
     * @param dizi  dizi
     * @param bas   parçanın bas indisi
     * @param orta  orta indisi
     * @param son   son indisi
     */
    void merge(int dizi[], int bas, int orta, int son)
    {
        // ikiye bölme
        int n1 = orta - bas + 1;
        int n2 = son - orta;
 
        // sağ ve sol diye yeni iki dizi oluşturulıyor
        int sol[] = new int[n1];
        int sag[] = new int[n2];
 
        // dizin sol tarafı sol adlı diziye atılıyor
        for (int i = 0; i < n1; ++i)
            sol[i] = dizi[bas + i];
        //dizin sag tarafı sag adlı diziye atılıyor
        for (int j = 0; j < n2; ++j)
            sag[j] = dizi[orta + 1 + j];
 
      
        
        int i = 0, j = 0;// sağ ve sol için eklenilecek elemanın indisi
 
       // sıralama işlemi
        int k = bas;
        while (i < n1 && j < n2) {// birleştirme işleminde sağ ve solun i. ve j  elemanı kontrol ediliyor 
            // küçük eleman ana listeye ekleniyor
            if (sol[i] <= sag[j]) {
                dizi[k] = sol[i];
                i++;
            }
            else {
                dizi[k] = sag[j];
                j++;
            }
            k++;
        }
 
       // sağ ve sol düzgün ve birbirinden sonra sıralı ise direk diziye atılıyor
        while (i < n1) {
            dizi[k] = sol[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            dizi[k] = sag[j];
            j++;
            k++;
        }
    }
 
    
    /**
     * sort fonksiyonumuz bölünen öğeleri her basamakta sıralar
     * 
     * 
     * @param dizi  verilen dizi
     * @param bas  bölünen parçanın ilk elemanı  
     * @param son  bölünen parçanın son elemanı
     */
    void sort(int dizi[], int bas, int son)
    {
        if (bas < son) {
            
            int orta =bas+ (son-bas)/2;//  her basamakta orta nokta bulunuyor
 
            sort(dizi, bas, orta);// birinci yarı sıralanıyor
            sort(dizi, orta + 1, son);//ikinci yarı sıralanıyor
 
          //parçalar birleştiriliyor
            merge(dizi, bas, orta, son);
            
            // en alt basamaktan üste doğru recursive şekilde birleştirerek çıkılıyor
        }
    }
 
    
    /**
     * verilen dizi yazdirilir
     * 
     * @param dizi  yazdirilacak diziyi giriniz
     */
    static void yazdir(int dizi[])
    {
        int n = dizi.length;
        for (int i = 0; i < n; ++i)
            System.out.print(dizi[i] + " ");
        System.out.println();
    }
    
    
    /**
     * verilen int diziyi char karakterler ile yazdırır
     * @param dizi  int dizi
     */
     static void charyazdir(int dizi[])
    {
        int n = dizi.length;
        for (int i = 0; i < n; ++i)
            System.out.print((char)dizi[i] + " ");
        System.out.println();
    }
 
   
}

