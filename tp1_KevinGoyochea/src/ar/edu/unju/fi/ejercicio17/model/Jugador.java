package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion;
	
	
	
	
	
	
	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, float estatura,
			float peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}






	public int calcularEdad() {
		LocalDate actual = LocalDate.now();
		Period años = Period.between(fechaNacimiento, actual);
		int edad = años.getYears();
		return edad;
	}

@Override
public String toString() {
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return "Nombre: " + this.nombre + "\n" +
           "Apellido: " + this.apellido + "\n" +
           "Fecha de Nacimiento: " + this.fechaNacimiento.format(formatoFecha) + "\n" +
           "Nacionalidad: " + this.nacionalidad + "\n" +
           "Estatura: " + this.estatura + "\n" +
           "Peso: " + this.peso + " kg"+ "\n" +
           "Posicion: " + this.posicion+ "\n"+
           "---------------------------";
}





	public String getNombre() {
		return nombre;
	}






	public void setNombre(String nombre) {
		this.nombre = nombre;
	}






	public String getApellido() {
		return apellido;
	}






	public void setApellido(String apellido) {
		this.apellido = apellido;
	}






	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}






	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}






	public String getNacionalidad() {
		return nacionalidad;
	}






	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}






	public float getEstatura() {
		return estatura;
	}






	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}






	public float getPeso() {
		return peso;
	}






	public void setPeso(float peso) {
		this.peso = peso;
	}






	public String getPosicion() {
		return posicion;
	}






	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}