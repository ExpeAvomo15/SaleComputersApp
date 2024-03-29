package mundopc.modelo;

public class DispositivoEntrada {
	private String tipoEntrada;
	private String marca;
	
	//Constructor
	public DispositivoEntrada(String tipoEntrada, String marca) {
		//super();
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	//GETTERS Y SETTERS
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
//ToString
	@Override
	public String toString() {
		return "DispositivoEntrada [tipoEntrada=" + tipoEntrada + ", marca=" + marca + "]";
	}
	
	
	
	
}
