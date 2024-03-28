package vehiculos;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	float precio;
	float peso;
	String traccion;
	Fabricante fabricante;
	static int cantidadVehiculos;
	
	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public int getPuertas() {
		return puertas;
	}



	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}



	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}



	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	public String getTraccion() {
		return traccion;
	}



	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
}
