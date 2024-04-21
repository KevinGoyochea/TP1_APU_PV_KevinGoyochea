package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List <Pais> paises = new ArrayList<>();
		List <DestinoTuristico> destinos = new ArrayList<>();
		paises.add(new Pais(4600, "Argentina"));
		paises.add(new Pais(1200, "Chile"));
		paises.add(new Pais(3700, "Bolivia"));
		paises.add(new Pais(0000, "Venezuela"));
		
		int opcion;
		boolean band=true;
		
		do {
			try {
				System.out.println("1- Alta de destino turistico ");
				System.out.println("2- Mostrar todos los destinos turisticos");
				System.out.println("3- Modificar el pais de un destino turistico");
				System.out.println("4- Limpiar el ArrayList de destino turistico");
				System.out.println("5- Eliminar un destino turistico");
				System.out.println("6– Mostrar los destinos turisticos ordenados por nombre");
				System.out.println("7– Mostrar todos los paises");
				System.out.println("8- Mostrar los destinos turisticos que pertenecen a un pais");
				System.out.println("9- Salir");
				opcion = scanner.nextInt();
				scanner.nextLine();
				switch(opcion) {
				case 1:{
					try {
						System.out.println("Ingrese codigo del destino turistico");
						int codigoDestino=scanner.nextInt();
						scanner.nextLine();
						System.out.println("Ingrese nombre del destino turistico");
						String nombre=scanner.nextLine();
						System.out.println("Ingrese precio del destino turistico");
						double precio = scanner.nextDouble();
						scanner.nextLine();
						System.out.println("Ingrese cantidad de dias");
						int cantidadDias = scanner.nextInt();
						System.out.println("Ingrese codigo del pais");
						int codigoPais = scanner.nextInt();
						Pais paisDestino = null;
						for (Pais d:paises) {
							if(d.getCodigo()==codigoPais) {
								paisDestino=d;
								break;
							}
						}
						if(paisDestino!=null) {
							DestinoTuristico destinoTurisco=new DestinoTuristico(codigoDestino, nombre, precio, cantidadDias, paisDestino);
							destinos.add(destinoTurisco);	
						}
					}catch(Exception e) {
						System.out.println("Los datos ingresados son invalidos");
					}		
					break;
				}
				case 2:{
					for(DestinoTuristico d:destinos) {
						System.out.println(d);
					}
					break;
				}
				case 3:{
					DestinoTuristico destinoEncontrado = null;
					System.out.println("Ingrese el codigo del destino turistico que desea modificar");
					int buscarDestino = scanner.nextInt();
					try {
						for(DestinoTuristico d:destinos) {
							if(d.getCodigoDestino() == buscarDestino) {
								destinoEncontrado=d;
								break;
							}
						}	
					}catch(Exception e) {
						System.out.println("Se ha encontrado un error");
					}
					if(destinoEncontrado != null) {
						System.out.println("Ingrese el nuevo pais");
						scanner.nextLine();
						String nuevoNombrePais = scanner.nextLine();
						Pais nuevoPais = new Pais(destinoEncontrado.getPais().getCodigo(),nuevoNombrePais);
						destinoEncontrado.setPais(nuevoPais);
						System.out.println("Se ha modificado el pais");
					}else {
						System.out.println("No se encontro el pais");
					}
					break;
				}
				case 4:{
					destinos.clear();
					System.out.println("Se ha limpiado el arraylist destino turistico");
					break;
				}
				case 5:{
					System.out.println("Ingrese el codigo del destino turistico que desea eliminar");
					int codigoEliminar=scanner.nextInt();
					boolean encontrado = false;
					Iterator<DestinoTuristico> iterador=destinos.iterator();
					while(iterador.hasNext()) {
						DestinoTuristico destino = iterador.next();
						if(destino.getCodigoDestino() == codigoEliminar) {
							iterador.remove();
							encontrado=true;
							System.out.println("el destino ha sido eliminado");
							break;
						}
							
					}
					
					break;
				}
				case 6:{
					destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
					for(DestinoTuristico d:destinos) {
					System.out.println(d);
					}
					break;
				}
				case 7:{
					try {
						if(paises.isEmpty()) {
							System.out.println("No hay paises disponibles");
						}else {
							System.out.println("Lista de paises");
							for(Pais p:paises) {
								System.out.println(p.getNombre());
							}
							System.out.println("-----------------");
						}
					}catch(Exception e) {
						System.out.println("Ha ocurrido un error en la lista de paises");
					}
					break;
				}
				case 8:{
					try {
						System.out.println("Ingrese el codigo del pais del cual desea ver los destinos turisticos ");
						int codigoPais=scanner.nextInt();
						boolean encontrado=false;
						for(DestinoTuristico d:destinos) {
							if(d.getPais().getCodigo()==codigoPais) {
								encontrado=true;
								System.out.println(d);
							}
						}
						if(encontrado=false) {
							System.out.println("No hay destinos turisticos para el pais seleccionado");
						}
					}catch(Exception e) {
						System.out.println("Se ha producido un error al mostrar los destinos turisticos");
					}finally {
					scanner.nextLine();
					}
					break;
				}
				case 9:{
					System.out.println("Gracias por navegar :)");
					band=false;
					break;
				}
				default:
					System.out.println("opcion invalida");
					break;
				}
			}catch(InputMismatchException e) {
				System.out.println("Por favor ingrese un numero entero valido");
				System.out.println("------------------------------------------");
				scanner.nextLine();
			}
		}while(band==true);
		
	}

}
