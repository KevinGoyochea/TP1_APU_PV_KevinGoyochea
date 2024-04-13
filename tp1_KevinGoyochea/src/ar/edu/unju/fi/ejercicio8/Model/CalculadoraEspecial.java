package ar.edu.unju.fi.ejercicio8.Model;

public class CalculadoraEspecial {
	//atributos
	private int n;
	
	//constructor
	public CalculadoraEspecial(int n){
		this.n=n;
	}
	
	//metodo que calcula la sumatoria
	public void calcularSumatoria() {
		int r1 =0;
		int r =1;	
		for (int k =1;k<=n;k++) {
			r = (k*(k+1)/2) ;
			r=r*r;
			r1 = r1 + r; 
		}
		System.out.println("El resultado de la sumatoria es: "+r1);	
	}
	
	//metodo que calcula proctoria
	public void calcularProductoria() {
		int r1 =1;
		int r =1;
		for (int k =1;k<=n;k++) {
			r = k*(k+4) ;
			r1 = r1 * r; 
		}
		System.out.println("El resultado de la productoria es: "+r1);
	}
}