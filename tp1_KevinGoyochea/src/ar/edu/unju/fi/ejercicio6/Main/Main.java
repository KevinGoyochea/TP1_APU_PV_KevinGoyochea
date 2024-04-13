package ar.edu.unju.fi.ejercicio6.Main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.Model.Persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Constructor por defecto
		Persona user = new Persona();
		System.out.println("se crea el objeto \"user\"  ");
		user.mostrarDatos();
		
		//contructor parametrizado pero con "jujuy" siendo valor de provincia
		System.out.println("ingrese sus datos ");
		System.out.println("DNI: ");
		String dni = scanner.nextLine();	
		System.out.println("Nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Fecha de Nacimiento (dd/MM/yyyy): ");
		LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine(),formatoFecha);
		//LocalDate fechac = LocalDate.parse(fechaNac, formatoFecha);
		Persona user1 = new Persona(dni, nombre, fechaNacimiento);
		user1.mostrarDatos();
		
		//contructor parametrizado
		Persona user3 = new Persona();
		System.out.println("ingrese sus datos ");
		System.out.println("DNI: ");
		user3.setDni(scanner.nextLine()); 	
		System.out.println("Nombre: ");
		user3.setNombre(scanner.nextLine());
		System.out.println("Fecha de Nacimiento (YYYY-MM-DD): ");
		LocalDate fechaNacimiento2 = LocalDate.parse(scanner.nextLine(),formatoFecha);
		user3.setFechaNac(fechaNacimiento2);
		System.out.println("Provincia: ");
		user3.setProvincia(scanner.nextLine());
		user3.mostrarDatos();
					
	}
}
