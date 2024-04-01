package vehiculos;

public class Camion  extends Vehiculo{
	private int ejes;
	static int nCamiones;
	
	public Camion(String placa, String nombre, float precio, float peso, Fabricante fabricante, int ejes) {
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes=ejes;
		nCamiones++;
	}
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
