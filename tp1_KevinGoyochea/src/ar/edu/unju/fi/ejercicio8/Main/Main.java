package ar.edu.unju.fi.ejercicio8.Main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio8.Model.CalculadoraEspecial;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor n para la sumatoria: ");
		int n = sc.nextInt();
		CalculadoraEspecial calc = new CalculadoraEspecial(n);
		calc.calcularSumatoria();
		CalculadoraEspecial calc2 = new CalculadoraEspecial(n);	
		calc2.calcularProductoria();
		
	}

}
