package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Escriba un numero entero, entre el 1 y el 9, que desee saber su tabla de multiplicacion: ");
		int num = sc.nextInt();
		if (num>0 && num<10) {
			for (int i=0;i<11;i++) {
				int multi = num * i;
				System.out.println(num+" x "+ i + " = "+ multi);
			}
		}else {
			System.out.println("El valor agregado no esta entre los parametros establecidos anteriormente");
		}
		

	}

}
