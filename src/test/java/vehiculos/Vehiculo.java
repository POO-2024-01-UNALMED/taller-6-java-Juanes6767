package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private float precio;
	private float peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, float precio, float peso, String traccion, Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.setFabricante(fabricante);
		fabricante.vehiculos.add(this);
		cantidadVehiculos++;
	}
	
	public String vehiculosPorTipo(){
		return "Automoviles: "+Automovil.nAutos+"\nCamionetas: "+Camioneta.nCamionetas+"\nCamiones: "+Camion.nCamiones;
		
	}
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



	public float getPrecio() {
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

	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos=cantidadVehiculos;
		
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
