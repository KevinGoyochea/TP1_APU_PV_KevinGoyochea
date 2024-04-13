package ar.edu.unju.fi.ejercicio7.Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.Model.Empleado;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los datos para un nuevo empleado");
		System.out.println("Nombre del empleado: ");
		String nombre = scanner.nextLine();
		System.out.println("Legajo del nuevo empleado: ");
		int legajo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese salario: $");
		float salario = scanner.nextFloat();
		Empleado empleado = new Empleado(nombre, legajo, salario);
		empleado.mostrarDatos();
		
		
		
	}
	
	
}
