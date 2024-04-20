package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño del array, del 5 al 10: ");
		int cantidad= scanner.nextInt();
		String [] array = new String[cantidad];
		scanner.nextLine();
		
		for (int i = 0;i<array.length;i++) {
			System.out.println("Ingrese nombres para rellenar el array");
			array[i]=scanner.nextLine();
		}
	
		for(int i=array.length -1 ;i>=0;i--) {
			System.out.println("Nombre: "+array[i]+" Posicion: "+i);
		}
	}

}
