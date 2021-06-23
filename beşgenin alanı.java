// beşgenin alanı= (5/2)*(r*r)*sin(72)
		
		Scanner scan=new Scanner(System.in);//input nesnesi oluşturuyoruz
		
		System.out.println("lütfen yarıçapı giriniz: ");
		
		int r=scan.nextInt();// yarıçapı alıyoruz
		
		
		double aderece = Math.toRadians(72);// radian cinsinden değere çevirdik
		// yani 2pi/5 = 1.2566370614359172

	        double sina = Math.sin(aderece);// sin(72*)
	        
		double alan= (5.0/2)*(r*r)*sina;
		
		System.out.printf("alan = %.2f",alan);