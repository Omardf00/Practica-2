package com.omar.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pantalla {

	Scanner sc = new Scanner(System.in);
	Loop1 loop1 = new Loop1();
	Loop2 loop2 = new Loop2();
	Loop3 loop3 = new Loop3();

	public void bienvenida() {
		System.out.println("Por favor, elija qué programa desea ejecutar:");
		System.out.println("1: Bucle que nos mostrará los números del 1 al 1000");
		System.out.println("2: Bucle que nos mostrará los números pares del 1 al 1000");
		System.out.println("3: Bucle que nos mostrará los números impares entre 2 opciones que el usuario introducirá");

	}

	public void entrada() {

		Integer x = 0;
		Integer a = null;
		Integer b = null;

		try {
			x = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Debe introducir un número entero entre el 1 y el 3");
		}

		switch (x) {
		case 1: {
			loop1.bucle();
		}
			break;
		case 2: {
			loop2.bucle();
		}
			break;
		case 3: {
			try {
				System.out.println("Introduzca el primer valor:");
				a = sc.nextInt();
				System.out.println("Introduzca el segundo valor:");
				b = sc.nextInt();
				loop3.loop(a, b);
			} catch (InputMismatchException e) {
				System.out.println("Debe introducir números enteros");
			}

		}
			break;
		}
	}

}
