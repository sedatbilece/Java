package alistirma;

import java.util.Locale;
import java.util.Scanner;

public class alistirma {

	
	
public static void main(String[] args ){
	
	Scanner input=new Scanner(System.in);
	
	input.useLocale(Locale.US); // double . veya , için standart belirtiliyor
	
	int R=6371;
	
    double e1,e2,b1,b2;
	
	System.out.println("enlem1 giriniz");
	e1=input.nextDouble();
	
	System.out.println("boylam1 giriniz");
	b1=input.nextDouble();
	
	System.out.println("enlem2 giriniz");
	e2=input.nextDouble();
	
	System.out.println("boylam2 giriniz");
	b2=input.nextDouble();
	
	
	double re1 = Math.toRadians(90-e1);
	
	double rb1 = Math.toRadians(90-b1);
			
	double re2 = Math.toRadians(90-e2);
			
	double rb2 = Math.toRadians(90-b2);
	
	//küresel kosinüs kanunu kullanarak zuznluk için çıkan son formül
	double b=Math.acos(Math.cos(re2)*Math.cos(re1)+Math.sin(re2)*Math.sin(re1)*Math.cos(rb2-rb1));
	
	// b açısı ile kürenin yarıçapı çarpılınca uzaklık bulunur
	double uzunluk =b*R;
	
	System.out.printf("iki nokta araasındaki uzunluk = %f",uzunluk);
    
    //kaynak;
	//https://rdno.org/notlar/dunya-uzerindeki-iki-noktanin-arasindaki-uzaklik-ve-azimut.html
	
    
    
	
	
		
}

}
