package ar.edu.unju.fi.ejercicio6.Main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.Model.Persona;

import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Persona user = new Persona();
		System.out.println("ingrese sus datos ");
		System.out.println("DNI: ");
		user.setDni(sc.nextLine()); 	
		System.out.println("Nombre: ");
		user.setNombre(sc.nextLine());
		System.out.println("Fecha de Nacimiento (YYYY-MM-DD): ");
		LocalDate fechaNac2 = LocalDate.parse(sc.nextLine());
		user.setFechaNac(fechaNac2);
		System.out.println("Provincia: ");
		user.setProvincia(sc.nextLine());
		user.mostrarDatos();
				
		sc.close();
	}

}
