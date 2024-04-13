package ar.edu.unju.fi.ejercicio10.Main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.Model.Pizza;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean band = true;
		do{	
			Pizza pizza = new Pizza();
			System.out.println("\nEscoja el diametro de la pizza que desea. Ofrecemos las siguientes opciones:\nPizzas pequeñas de 20 \nPizzas medianas de 30 \nPizzas grandes de 40 ");
			pizza.setDiametro(scanner.nextInt());
			if (pizza.getDiametro()==20 || pizza.getDiametro()==30 || pizza.getDiametro()==40) {
				System.out.println("La pizza lleva ingredientes especiales?");
				String respuesta = scanner.next();
				char caracter = respuesta.charAt(0);
				if (caracter == 'S' || caracter == 's') {
					pizza.setIngredientesEspeciales(true);
				}
				pizza.mostrarDatos();
				System.out.println("Desea ordenar mas pizzas?(S/N): ");
				String respuesta2 = scanner.next();
				char caracter2 = respuesta2.charAt(0);
				if(caracter2 =='N' || caracter2 =='n') {
					band = false;
				}
				}else {
					System.out.println("El perimetro ingresado no es valido controle las opciones validas\n");
				}
		}while (band == true);
	}
}
