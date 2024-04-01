package vehiculos;

public class Camioneta  extends Vehiculo{
	private boolean volco;
	static int nCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, float precio, float peso, Fabricante fabricante, boolean volco) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
		this.volco=volco;
		nCamionetas++;
	}
	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
}
