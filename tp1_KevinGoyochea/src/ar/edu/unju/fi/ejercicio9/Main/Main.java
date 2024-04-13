package ar.edu.unju.fi.ejercicio9.Main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.Model.Producto;
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i=0;i<3;i++) { 
		Producto producto = new Producto() ;	
		System.out.println("Ingrese nombre del producto: ");
		producto.setNombre (scanner.nextLine());
		System.out.println("ingrese el codigo del producto: ");
		producto.setCodigo(scanner.nextInt());
		System.out.println("Ingrese precio del producto: ");
		producto.setPrecio(scanner.nextDouble());
		System.out.println("¿El producto tiene un descuento?(S/N) ");
		String cad = scanner.next();
		char car = cad.charAt(0); 
		if (car=='s' || car == 'S') {
			System.out.println("¿De cuanto es el descuento? (monto del $1 al $50):");
			producto.setDescuento(scanner.nextInt());
			}	
		scanner.nextLine();
		producto.mostrarDatos();
		}
	}
		
}


