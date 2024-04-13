package ar.edu.unju.fi.ejercicio6.Model;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	//constructor por defecto
	public Persona() {
	}

	//constructor que inicialisa los valores de todos los atributos
	public Persona(String dni, String nombre, LocalDate fechaNac, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNac;
		this.provincia = provincia;
	}

	//constructor de dni nombre y fechaNac
	public Persona( String dni, String nombre, LocalDate fechaNac) {
		this.dni = dni;
		this.nombre = nombre;
		this.provincia = "jujuy";
		this.fechaNacimiento = fechaNac;
	}

	//metodo que calcula la edad
	public int calcularEdad() {
		LocalDate actual = LocalDate.now();
		Period años = Period.between(fechaNacimiento, actual); 
		int edad = años.getYears();
		return edad;
	}
	
	//metodo que calcula si es mayor de edad o no
	public String mayorDeEdad () {
			
		if (calcularEdad()>18) {
			String legal=" es mayor de edad";
			return legal;
		}else {
			String legal=" es menor de edad";
			return legal;
		}
	}
	
	//metodo que muestra los datos
	public void  mostrarDatos() {
			System.out.println("DNI: "+dni);
			System.out.println("Nombre: "+nombre);
		try {
			System.out.println("Feha de Nacimiento: "+fechaNacimiento.format(formatter));
		}catch(Exception e) {
			System.out.println("Fecha de Nacimiento: "+"no se puede calcular la fecha de nacimiento si no hay valores");
		}
			System.out.println("Provincia: "+provincia);
		try {
			System.out.println("Edad: " + calcularEdad());
		}catch(Exception e) {
			System.out.println("Edad: " + "no se puede calcular la edad sin valores");
		}
		try {
			System.out.println("El usuario "+nombre+mayorDeEdad());
		}catch(Exception e) {
			System.out.println("El usuario "+" no se puede calcular si es mayor de edad sin valores");
		}
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
		return fechaNacimiento;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNacimiento = fechaNac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	
}
