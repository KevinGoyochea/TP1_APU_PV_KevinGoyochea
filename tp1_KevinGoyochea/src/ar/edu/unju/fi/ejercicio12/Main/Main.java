package ar.edu.unju.fi.ejercicio12.Main;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.Model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("ingrese nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese fecha de nacimiento");
		LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine(),formatoFecha);
		Persona user = new Persona(nombre, fechaNacimiento);
		
		user.mostrarDatos();
	}

}
