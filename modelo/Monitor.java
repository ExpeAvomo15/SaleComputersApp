package mundopc.modelo;

public class Monitor {
	private final int idMonitor;
	private String marca;
	private double tamnio;
	private static int contMonitores;
	
	//Constructor vacio
	private Monitor() {
		idMonitor = ++contMonitores;
	}
	
	//Constructor parametrizado
	public Monitor(String marca, double tamanio) {
		this();
		this.marca = marca;
		this.tamnio = tamanio;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamnio=" + tamnio + "]";
	}

	
	
	
	
}
