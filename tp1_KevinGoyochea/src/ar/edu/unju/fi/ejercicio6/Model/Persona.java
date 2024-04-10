package ar.edu.unju.fi.ejercicio6.Model;
import java.time.LocalDate;
import java.time.Period;
public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNac;
	private String provincia;
	
	public int calcularEdad() {
		LocalDate actual = LocalDate.now();
		Period años = Period.between(fechaNac, actual); 
		int edad = años.getYears();
		return edad;
	}
	
	public String mayorDeEdad () {
			
		if (calcularEdad()>18) {
			String legal=" es mayor de edad";
			return legal;
		}else {
			String legal=" es menor de edad";
			return legal;
		}
		
	}
	
	public void  mostrarDatos() {
		System.out.println("DNI: "+dni);
		System.out.println("Nombre: "+nombre);
		System.out.println("Feha de Nacimiento: "+fechaNac);
		System.out.println("Provincia: "+provincia);
		System.out.println("Edad: " + calcularEdad());
		System.out.println("El usuario "+nombre+" "+mayorDeEdad());
	
	}
	//constructor por defecto
	public Persona() {
	}
	
	//constructor que inicialisa los valores de todos los atributos
	public Persona(String dni, String nombre, LocalDate fechaNac, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = provincia;
	}
	
	//constructor que inicialisa dni nombre y fechaNac
	public Persona(String xnombre, String xdni, LocalDate xfechaNac) {
		nombre = xnombre;
		dni = xdni;
		provincia = "jujuy";
		fechaNac = xfechaNac;
	}
	
	//getters and setters
	public String getDni() {
		return dni;
	}

	public void setDni(String string) {
		this.dni = string;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	
}
