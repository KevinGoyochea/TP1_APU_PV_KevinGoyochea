package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del array desde el 3 hasta el 10: ");
		int cantidad = scanner.nextInt();
		int suma=0;
		int [] array = new int[cantidad];
		
		for (int i = 0 ; i<array.length;i++) {
			System.out.println("Ingrese valor: ");
			array[i]=scanner.nextInt();
		}
		
		for(int i = 0;i<array.length;i++) {
			suma=suma+array[i];
			System.out.println("Valor en la Posicion: "+i+" = "+array[i]+" Suma: "+suma);
		}
		
	}

}
