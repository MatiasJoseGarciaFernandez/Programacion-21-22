package menu_vehiculos;

public class Coche extends Vehiculo {
	private int kilometrajeCoche;
	
	public Coche(int kiCo) {
		
		this.kilometrajeCoche=kiCo;
		
	}
	public int CogeKil() {
		return this.kilometrajeCoche;
	}
	
	public void avanzaCoche() {
		System.out.println("El coche avanza");
	}
	
	public void quemaRueda() {
		System.out.println("*sonido de coche quemando rueda*");
	}
}


