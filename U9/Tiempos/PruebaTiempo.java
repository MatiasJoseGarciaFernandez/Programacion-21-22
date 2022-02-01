package Tiempos;

public class PruebaTiempo {
	public static void main(String[]args) {
		
		Tiempo h1 = new Tiempo(5, 30, 50);
		Tiempo h2 = new Tiempo(6, 25, 30);
		
		System.out.println(h1);
		System.out.println(h2);
		
		System.out.println(h1 +" + "+h2+" = " + h1.suma(h2));
		System.out.println(h2 +" - "+h1+" = " + h2.resta(h1));
	}
}
