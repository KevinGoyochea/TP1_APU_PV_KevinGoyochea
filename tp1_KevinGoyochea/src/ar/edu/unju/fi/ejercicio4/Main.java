package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int i, factorial=1, numero1 ;
		System.out.println("Ingrese el numero entero, entre el 0 y el 10, que desee calcular el factorial");
		int numero = scanner.nextInt();
		numero1=numero;
		if (numero>=0 && numero<=10) {
			System.out.println(numero);
			while (numero!=0) {
				factorial=factorial*numero;
				numero=numero-1;
			}
		}else {
			System.out.println("el valor añadido no es valido, verifique los parametros establecidos");
		}
		System.out.println("El factorial de "+numero1+" es: "+factorial);

	}

}
