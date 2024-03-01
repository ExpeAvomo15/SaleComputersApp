package mundopc.modelo;

public class Raton extends DispositivoEntrada{
	private final int idRaton;
	private static int contRatones;
	
	//Constructor
	public Raton(String tipoEntrada,String marca) {
		super(tipoEntrada, marca);
		idRaton = ++contRatones;
		
	}
	
	
	//tostring
	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton + "]" + super.toString();
	}
	
	
	
}
