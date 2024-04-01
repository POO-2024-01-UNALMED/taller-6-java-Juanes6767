package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	static int nAutos;
	
	public Automovil(String placa, String nombre, float precio,float peso, Fabricante fabricante, int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puestos;
		nAutos++;
	}
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
