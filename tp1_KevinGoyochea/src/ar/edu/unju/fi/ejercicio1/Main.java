package ar.edu.unju.fi.ejercicio1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random ();
			
		
		int num1 = random.nextInt(20);
		int num2 = random.nextInt(20);
		int num3 = random.nextInt(20);
		int num4 = random.nextInt(20);
		int num5 = random.nextInt(20);
		
		int prom = (num1 + num2 + num3 + num4 + num5)/5;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println("el promedio es: "+prom);
	}

}
