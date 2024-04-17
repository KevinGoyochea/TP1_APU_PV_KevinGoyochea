package ar.edu.unju.fi.ejercicio12.Model;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		
		
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}



	//metodo que calcula la edad
		public int calcularEdad() {
			LocalDate actual = LocalDate.now();
			Period años = Period.between(fechaNacimiento, actual); 
			int edad = años.getYears();
			return edad;
		}
	
		//metodo que determina el signo
		public String determinaSigno() {
			int diaAnio = fechaNacimiento.getDayOfYear();
			String signo= "";
			if(diaAnio>=81 && diaAnio<=110) {
				signo = "Aries ";
				return signo;
			}else {
				if(diaAnio>=111 && diaAnio<=141) {
					signo = "Tauro ";
					return signo;
				}else {
					if(diaAnio>=142 && diaAnio<=172){
						signo = "Geminis ";
						return signo;
					}else {
						if(diaAnio>=173 && diaAnio<=204) {
							signo = "Cancer ";
							return signo;
						}else {
							if(diaAnio>=205 && diaAnio<=235) {
								signo = "Leo ";
								return signo;
							}else {
								if(diaAnio>=236 && diaAnio<=266) {
									signo = "Virgo ";
									return signo;
								}else {
									if(diaAnio>=267 && diaAnio<=296){
										signo = "Libra ";
										return signo;
									}else {
										if(diaAnio>=297 && diaAnio<=326){
											signo = "Escorpio ";
											return signo;
										}else {
											if(diaAnio>=327 && diaAnio<=356) {
												signo = "Sagitario ";
												return signo;
											}else {
												if(diaAnio>=357 && diaAnio<=365 || diaAnio>=1 && diaAnio<=19) {
													signo = "Capricornio ";
													return signo;
												}else {
													if(diaAnio>=20 && diaAnio<=49) {
														signo = "Acuario ";
														return signo;
													}else {
														if(diaAnio>=50 && diaAnio<=80) {
															signo = "Piscis ";
															return signo;
														}else {
															return signo;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		//metodo que calcula la estacion del anio
		public String calcularEstacionAnio () {
			int diaAnio = fechaNacimiento.getDayOfYear();
			String estacionAnio = " ";
			if (diaAnio>=356 && diaAnio<=365 || diaAnio>=1 && diaAnio<=81 ) {
				estacionAnio="Verano";
				return estacionAnio;
			}else {
				if(diaAnio>=82 && diaAnio<=173) {
					estacionAnio="Otoño";
					return estacionAnio;
				}else {
					if(diaAnio>=174 && diaAnio<=265) {
						estacionAnio="Invierno";
						return estacionAnio;
					}else {
						if(diaAnio>=266 && diaAnio<=355)
							estacionAnio="Primavera";
							return estacionAnio;
					}
				}
			}
		}
		
		//metodo que muestra los datos
		public void mostrarDatos () {
			System.out.println("Nombre: "+nombre);
			System.out.println("Fecha de Nacimiento: "+fechaNacimiento.format(formatter));
			System.out.println("Edad: "+calcularEdad()+" años");
			System.out.println("Signo del zodiaco: " +determinaSigno());
			System.out.println("Estacion: "+calcularEstacionAnio());
		}
		
		
		/*public Strig determinarSigno() {
			if (fechaNacimiento >= 21-03
			
		}*/
	
	
	
}
