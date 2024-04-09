package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese un numero entero");
		int num = sc.nextInt();
		if (( num % 2) == 0) {
		num = num*3;	
		System.out.println(num);
		} else {
		num= num*2;	
			System.out.println(num);
		}
		
	}

}
