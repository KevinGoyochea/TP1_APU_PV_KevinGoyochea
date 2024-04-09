package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i, fact=1, num1 ;
		System.out.println("Ingrese el numero entero, entre el 0 y el 10, que desee calcular el factorial");
		int num = sc.nextInt();
		num1=num;
		if (num>=0 && num<=10) {
			System.out.println(num);
			while (num!=0) {
				fact=fact*num;
				num=num-1;
			}
		}else {
			System.out.println("el valor añadido no es valido, verifique los parametros establecidos");
		}
		System.out.println("El factorial de "+num1+" es: "+fact);

	}

}
