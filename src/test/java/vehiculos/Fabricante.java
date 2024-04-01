package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	ArrayList<Vehiculo> vehiculos;
	ArrayList<Fabricante> fabricas;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		pais.fabricantes.add(this);
		fabricas.add(this);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public static Vehiculo fabricaMayorVentas() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
