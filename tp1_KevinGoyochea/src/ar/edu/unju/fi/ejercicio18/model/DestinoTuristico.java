package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private int codigoDestino;
	private String nombre;
	private double precio;
	private int cantidadDias;
	private Pais pais;
	

	
	public DestinoTuristico(int codigoDestino, String nombre, double precio, int cantidadDias, Pais paisDestino) {
		super();
		this.codigoDestino = codigoDestino;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDias = cantidadDias;
		this.pais = paisDestino;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Codigo: "+this.codigoDestino+"\n"+
				"Nombre: "+this.nombre+"\n"+
				"Precio: $"+this.precio+"\n"+
				"Pais: "+this.pais.getNombre()+"\n"+
				"cantidad de dias: "+this.cantidadDias+"\n"+
				"-------------------------------------------";
	}



	public int getCodigoDestino() {
		return codigoDestino;
	}



	public void setCodigoDestino(int codigoDestino) {
		this.codigoDestino = codigoDestino;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getCantidadDias() {
		return cantidadDias;
	}



	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}



	public Pais getPais() {
		return pais;
	}



	public void setPais(Pais nuevoPais) {
		this.pais = nuevoPais;
	}
	
}
	