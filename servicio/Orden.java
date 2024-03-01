package mundopc.servicio;

import java.util.ArrayList;
import java.util.List;

import mundopc.modelo.Computadora;

public class Orden {
	//ATRIBUTOS
	private final int idOrden;
	private List<Computadora> computadoras;
	private static int contOrdenes;
	
	
	//CONSTRUCTOR VACIO
	public Orden () {
		idOrden = ++contOrdenes;
		computadoras = new ArrayList<>();
	}
	
	//Agregar Computadoras
	public void agregarComputadora (Computadora computadora) {
		computadoras.add(computadora);
	}
	
	//Mostrar orden
	public void mostrarOrden () {
		System.out.println("Orden #: "+idOrden);
		System.out.println("Total computadoras: "+computadoras.size());
		//System.out.println();
		computadoras.forEach(System.out::println);
		
	}
	
	
	
	
}
