package Ej1U9;

public class Caballo {
		
	private String color;
	
	private int edad;
	
	private String nombre;
		
	private int carrerasGanadas;
	
	
	
	
	public Caballo(String c, int e, String n, int cg) {
		this.color=c;
		this.edad=e;
		this.nombre=n;
		this.carrerasGanadas=cg;
	}
	
	public String CogeNombre() {
		return this.nombre;
	}
	
	public void cabalga() {
		System.out.println("El caballo cabalga");
	}
	
	public void relincha() {
		System.out.println("El caballo relincha");
	}
	
	public void rumia() {
		System.out.println("El caballo rumia");
	}

	
	
}
