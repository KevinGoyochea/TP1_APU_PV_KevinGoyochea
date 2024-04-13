package ar.edu.unju.fi.ejercicio10.Model;

public class Pizza {
	//atributos 
	private int diametro ;
	private int precio;
	private double area;
	private boolean ingredientesEspeciales;
	private final int INGREDIENTE_ADICIONAL_20=500;
	private final int INGREDIENTE_ADICIONAL_30=750;
	private final int INGREDIENTE_ADICIONAL_40=1000;
	private static int contadorPizzas=0;
	
	//constructor
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	//metodo que calcula el precio
	public int calcularPrecio() {
		switch (diametro){
			case 20:
				if (ingredientesEspeciales==true) {
					precio=4500+INGREDIENTE_ADICIONAL_20;
				}else {
					precio=4500;
				}
			break;
			
			case 30:
				if (ingredientesEspeciales==true) {
					precio=4800+INGREDIENTE_ADICIONAL_30;
				}else {
					precio=4800;
				}
				
			case 40: 
				if (ingredientesEspeciales==true) {
					precio=5500+INGREDIENTE_ADICIONAL_40;
				}else {
					precio=5500;
				}	
		}
		return precio;
	}

	//metodo que calcula el area
	public double calcularArea() {
		final double PI = 3.14159 ;
		double radio = diametro /(2 * PI) ;
		area= PI*(radio*radio);
		return area;
	}
	
	
	//metodo que muestra los datos
	public void mostrarDatos() {
		contadorPizzas++;
		System.out.println("       **PIZZA "+contadorPizzas+"**    ");
		System.out.println("Diametro "+diametro+" \n");
		System.out.println("Ingredientes especiales: "+ingredientesEspeciales+"\n");
		System.out.println("Precio pizza: $"+calcularPrecio()+"\n");
		System.out.println("Area de la pizza: "+calcularArea()+"\n");
	}

	//getters and setters
	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
