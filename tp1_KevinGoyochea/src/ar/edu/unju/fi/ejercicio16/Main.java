package ar.edu.unju.fi.ejercicio16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String [] array = new String [5];
		int band=0;
		boolean bandera = false;
		byte indice;
		for(int i=0;i<array.length;i++) {
			System.out.println("Ingrese un nombre para guardar en el array");
			array[i]=scanner.nextLine();
		}
		
		while(band<array.length) {
			System.out.println("El valor en la posicion: "+band+" = "+array[band]);
			band++;
		}
		
		do {
			System.out.println("Desea borrar algun valor?(S/N)");
			String respuesta = scanner.nextLine();
			char rta = respuesta.charAt(0);
			if(rta=='S'||rta=='s') {
				System.out.println("Ingrese el indice del valor que desea borrar");
				indice = scanner.nextByte();
				scanner.nextLine();
				if (indice>=0 && indice<=4) {
					for (int k = indice; k<array.length -1 ;k++) {
						array[k]=array[k+1];
					}
					array[array.length-1]="";
					for(int i =0;i<array.length;i++) {
						System.out.println("El valor en la posicion: "+i+" = "+array[i]);
					}
				}else {
					System.out.println("El indice excede la cantidad de valores");
				}
			}else {
				System.out.println("Despues de borrar los datos el array quedo asi");
				System.out.println("-----------------------------------------------");
				for(int i =0;i<array.length;i++) {
					System.out.println("El valor en la posicion: "+i+" = "+array[i]);
				}
				bandera=true;
			}
		}while(bandera==false);
		
		
			
		}
		
	}


