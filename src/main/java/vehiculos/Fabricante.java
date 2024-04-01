package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	ArrayList<Vehiculo> vehiculos;
	static ArrayList<Fabricante> fabricas;
	private static Fabricante mayorFabrica;
	
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
	public static Fabricante fabricaMayorVentas() {
		for(int i=0;i<fabricas.size();i++) {
			int mayor=0;
			int acum=fabricas.get(i).vehiculos.size();
			if(acum>=mayor) {
				mayor+=acum;
				mayorFabrica=fabricas.get(i);
				
			}
			
		}
		return mayorFabrica;
	}
	
}
