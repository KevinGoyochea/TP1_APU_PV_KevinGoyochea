package ar.edu.unju.fi.ejercicio7.Model;

public class Empleado {
	private String nombre;
	private int legajo;
	private float salario;
	final float SALARIO_MINIMO = 210000f;
	final float MERITOS = 20000f;
	
	//constructor parametrizado
	public Empleado (String nombre, int legajo, float salario) {
		this.nombre = nombre ;
		this.legajo = legajo;
		if(salario>=SALARIO_MINIMO) {
			this.salario=salario;
			
		}else {
			 this.salario=SALARIO_MINIMO;
		}
	}
	
	//metodo que aumenta el salario
	public float aumentoSalario() {
		float salario2 = salario+MERITOS;
		return salario2;
	}
	
	//metodo que muestra los datos
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario: $"+salario);
		System.out.println("salario actual mas aumento: "+aumentoSalario());
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}
