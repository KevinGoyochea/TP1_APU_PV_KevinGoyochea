package ar.edu.unju.fi.ejercicio17.main;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Jugador> jugadores = new ArrayList<>();
		//PARA PROBAR SI FUNCIONA O NO
		//jugadores.add(new Jugador("lionel","Messi",  LocalDate.parse("24/06/1987", formatoFecha), "argentina", 1.69f, 79f, "delantero"));
		//jugadores.add(new Jugador("cristian","Alvares", LocalDate.parse("13/06/1993", formatoFecha), "chile", 1.72f, 70f, "delantero"));
		//jugadores.add(new Jugador("kevin","goyochea", LocalDate.parse("02/04/2001", formatoFecha), "argentina", 1.70f, 62f, "defensor"));
		
		Scanner scanner=new Scanner(System.in);
		
		boolean band=true;
		int opcion; 
		do {
			System.out.println("1- Alta de jugador ");
			System.out.println("2- Mostrar los datos");
			System.out.println("3- Mostrar todos los jugadores ordenados por apellido");
			System.out.println("4- Modificar los datos de un jugador");
			System.out.println("5- Eliminar un jugador");
			System.out.println("6– Mostrar la cantidad total de jugadores que tiene el ArrayList");
			System.out.println("7– Mostrar la cantidad de jugadores que pertenecen a una nacionalidad (ingrese la nacionalidad");
			System.out.println("8- Salir");
			opcion = scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
			case 1:{
				System.out.println("Ingrese nombre del jugador");
				String nombre = scanner.nextLine();
				System.out.println("Ingrese apellido del jugador");
				String apellido = scanner.nextLine();
				System.out.println("Ingrese fecha de nacimiento del jugador");
				LocalDate fechaNacimineto = LocalDate.parse(scanner.nextLine(),formatoFecha);
				System.out.println("Ingrese Pais del jugador");
				String nacionalidad = scanner.nextLine();
				System.out.println("Ingrese estatura del jugador (utilize ',')");
				float estatura = scanner.nextFloat();
				scanner.nextLine();
				System.out.println("Ingrese peso del jugador");
				float peso = scanner.nextFloat();
				scanner.nextLine();
				System.out.println("Ingrese posicion del jugador");
				String posicion = scanner.nextLine();
				Jugador jugador = new Jugador(nombre, apellido, fechaNacimineto, nacionalidad, estatura, peso, posicion);
				jugadores.add(jugador);
				break;
				}
			case 2:{
				for(Jugador j:jugadores) {
					System.out.println(j);
				}
				break;
				}
			case 3:{
				jugadores.sort(Comparator.comparing(Jugador::getApellido));	
				for(Jugador j:jugadores) {
					System.out.println(j);
				}
				break;
				}
			case 4:{
				Jugador jugadorEncontrado = null;
				System.out.println("Ingrese el Nombre del jugador");
				String nombreBuscar = scanner.nextLine();
				System.out.println("Ingrese el Apellido del jugador");
				String apellidoBuscar = scanner.nextLine();
				try {	
					for (Jugador j:jugadores) {						
							if(j.getNombre().equalsIgnoreCase(nombreBuscar) && j.getApellido().equalsIgnoreCase(apellidoBuscar)) {
							jugadorEncontrado = j;
								if(jugadorEncontrado != null) {
									System.out.println("Ingrese nombre del jugador");
									String nombre = scanner.nextLine();
									System.out.println("Ingrese apellido del jugador");
									String apellido = scanner.nextLine();
									System.out.println("Ingrese fecha de nacimiento del jugador");
									LocalDate fechaNacimineto = LocalDate.parse(scanner.nextLine(),formatoFecha);
									System.out.println("Ingrese nacionalidad del jugador");
									String nacionalidad = scanner.nextLine();
									System.out.println("Ingrese estatura del jugador (utilize ',')");
									float estatura = scanner.nextFloat();
									scanner.nextLine();
									System.out.println("Ingrese peso del jugador");
									float peso = scanner.nextFloat();
									scanner.nextLine();
									System.out.println("Ingrese posicion del jugador");
									String posicion = scanner.nextLine();
									Jugador jugador = new Jugador(nombre, apellido, fechaNacimineto, nacionalidad, estatura, peso, posicion);
									jugadores.add(jugador);
								}
							}
						}
							
					}catch(Exception e){
						System.out.println("No se pudo encontrar ese jugador");
					}
					break;
				}
			case 5:{
				System.out.println("Ingrese el Nombre del jugador");
				String nombreBorrar = scanner.nextLine();
				System.out.println("Ingrese el Apellido del jugador");
				String apellidoBorrar = scanner.nextLine();				
				boolean jugadorEncontrado = false;
				for(Iterator<Jugador> iterador =jugadores.iterator();iterador.hasNext();) {
					Jugador jugador=iterador.next();						
					if(jugador.getNombre().equalsIgnoreCase(nombreBorrar) && jugador.getApellido().equalsIgnoreCase(apellidoBorrar)) {
						iterador.remove();
						System.out.println("El jugador ha sido borrado del array");
						jugadorEncontrado=true;
						}
						break;	
				}
				if(!jugadorEncontrado) {
					System.out.println("No se encontro el jugador");
					System.out.println("-------------------------");
				}
				break;	
			}	
										
					
			
			case 6:{
				System.out.println("Hay "+jugadores.size()+" jugadores ingresados");
				System.out.println("------------------------------------------------");
				break;
			}
			case 7:{
				System.out.println("Ingrese el pais");
				String buscarPais = scanner.nextLine();
				int numeroJugadores = 0;
				for(Jugador j:jugadores) {
					if(j.getNacionalidad().equalsIgnoreCase(buscarPais)) {
						numeroJugadores++;
					}		
				}
				if(numeroJugadores>0) {
					System.out.println("Hay "+numeroJugadores+" jugadores de "+buscarPais);
					System.out.println("------------------------------------------------");
				}else {
					System.out.println("No hay jugadores de "+buscarPais);
					System.out.println("------------------------------------------------");
				}
				break;
			}
			case 8:{
				band=false;
				System.out.println("Gracias por ingresar. Adios :)");
				break;
			}
			default:
				System.out.println(opcion+" No es una opcion valida intentelo nuevamente");
				System.out.println("------------------------------------------------");
				break;
			}
		}while (band==true);	
	}	
}			

