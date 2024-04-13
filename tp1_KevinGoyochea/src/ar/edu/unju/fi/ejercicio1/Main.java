package ar.edu.unju.fi.ejercicio1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random ();
			
		
		int numero1 = random.nextInt(20);
		int numero2 = random.nextInt(20);
		int numero3 = random.nextInt(20);
		int numero4 = random.nextInt(20);
		int numero5 = random.nextInt(20);
		
		int promedio = (numero1 + numero2 + numero3 + numero4 + numero5)/5;
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(numero4);
		System.out.println(numero5);
		System.out.println("El promedio es: "+promedio);
	}

}
