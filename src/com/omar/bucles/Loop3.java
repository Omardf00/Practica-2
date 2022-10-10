package com.omar.bucles;

public class Loop3 {
	
	Impar impar = new Impar();
	
	public void loop(Integer a, Integer b) {
		
		if (a < b) {
			while (b > a) {
				if (impar.esImpar(a)) {
					System.out.println(a);
				}
				a++;
			}
		}
		else if (a > b) {
			while (a > b) {
				if (impar.esImpar(b)) {
					System.out.println(b);
				}
				b++;
			}
		}
		else {
			System.out.println("Los números son iguales");
		}
	}

}
