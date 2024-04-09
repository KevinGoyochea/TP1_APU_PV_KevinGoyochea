package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i, fact=1, num1 ;
		System.out.println("Ingrese el numero que desee calcular el factorial");
		int num = sc.nextInt();
		num1=num;
		System.out.println(num);
		while (num!=0) {
			fact=fact*num;
			num=num-1;
		}
		System.out.println("El factorial de "+num1+" es: "+fact);

	}

}
