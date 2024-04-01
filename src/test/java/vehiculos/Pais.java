package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	ArrayList<Fabricante> fabricantes;
	ArrayList<Pais> paises;
	
	public static Pais paisMasVendedor() {
		return null;
	}
	
	public Pais(String nombre) {
		this.nombre=nombre;
		paises.add(this);
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
