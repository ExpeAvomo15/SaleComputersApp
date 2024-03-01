package mundopc;



import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos un objeto de tipo Raton
		Raton ratonLenovo = new Raton ("Bluetooth", "Lenovo");
		//System.out.println(ratonLenovo);
		
		//Creamos un objeto de Teclado
		Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
		//System.out.println(tecladoLenovo);
		
		//Creamos un objeto de tipo Monitor
		Monitor monitorLenovo = new Monitor("Lenovo", 27);
		//System.out.println(monitorLenovo);
		
		//Creamos un objeto de tipo Computadora
		Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
		//System.out.println(computadora);
		
		//Creamos una computadora Delll
		Monitor monitorDell = new Monitor("Dell", 15);
		Teclado tecladoDell = new Teclado("USB", "Dell");
		Raton ratonDell = new Raton("USB", "Dell");
		Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
		
		//Creamos una computadora Mac
		Monitor monitorMac = new Monitor("Mac", 27);
		Teclado tecladoMac = new Teclado("USB", "Mac");
		Raton ratonMac = new Raton("USB", "Mac");
		Computadora computadoraMac = new Computadora("computadora Mac ", monitorMac, tecladoMac, ratonMac);
		
		//Creamos una orden
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraLenovo);
		orden1.agregarComputadora(computadoraDell);
		orden1.mostrarOrden();
		
		System.out.println();
		
		//Añadimos una nueva orden
		Orden orden2 = new Orden();
		orden2.agregarComputadora(computadoraMac);
		orden2.agregarComputadora(computadoraDell);
		orden2.agregarComputadora(computadoraLenovo);
		orden2.mostrarOrden();
		
		
		
		
		
		

	}

}
