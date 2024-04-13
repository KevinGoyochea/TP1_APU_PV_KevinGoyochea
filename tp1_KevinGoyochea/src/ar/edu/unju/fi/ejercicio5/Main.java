package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;
public class Main {
	// mostrar por consola la tabla de multiplicar 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in) ;
		System.out.println("Escriba un numero entero, entre el 1 y el 9, que desee saber su tabla de multiplicacion: ");
		int numero = scanner.nextInt();
		if (numero>0 && numero<10) {
			for (int i=0;i<11;i++) {
				int multiplicacion = numero * i;
				System.out.println(numero+" x "+ i + " = "+ multiplicacion);
			}
		}else {
			System.out.println("El valor agregado no esta entre los parametros establecidos anteriormente");
		}
	}
}
