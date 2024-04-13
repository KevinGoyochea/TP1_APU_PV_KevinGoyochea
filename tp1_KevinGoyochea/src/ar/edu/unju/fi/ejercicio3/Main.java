package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero entero");
		int numero = scanner.nextInt();
		if (( numero % 2) == 0) {
			numero = numero*3;	
			System.out.println(numero);
		} else {
			numero= numero*2;	
			System.out.println(numero);
		}
		
	}

}
