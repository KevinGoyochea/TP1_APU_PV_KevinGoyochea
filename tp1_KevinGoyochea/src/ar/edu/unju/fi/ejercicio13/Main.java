package ar.edu.unju.fi.ejercicio13;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int [] array = new int[8];
		
		
		for(int i = 0;i<array.length;i++) {
			System.out.println("ingrese valor: ");
			array[i]=scanner.nextInt();
		}
		for(int i = 0;i<array.length;i++) {
			System.out.println("Valor en la posicion "+i+" = "+array[i]);
		}	
	}
}
