package ar.edu.unju.fi.ejercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		List lista = new ArrayList();
		int cantidad=0;
		while( cantidad!= 8) {
			System.out.println("Ingrese un valora para agregar al array");
			lista.add(scanner.nextInt());
			cantidad++;
		}
		
		for(int i = 0;i<lista.size();i++) {
			System.out.println("Valor: "+lista.get(i)+" indice: "+i);
		}
	}

}
