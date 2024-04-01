package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	ArrayList<Fabricante> fabricantes;
	static ArrayList<Pais> paises;
	private static Pais mayorPais;
	
	public static Pais paisMasVendedor() {
		int mayor=0;
		for(int i=0;i<paises.size();i++) {
			int cont=0;
						
			for (int a=0;i>paises.get(i).fabricantes.size();a++) {
				cont+=paises.get(i).fabricantes.get(a).vehiculos.size();
			}
			if(cont>mayor) {
				mayor+=cont;
				mayorPais=paises.get(i);
		}
		}
		
		return mayorPais;
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
