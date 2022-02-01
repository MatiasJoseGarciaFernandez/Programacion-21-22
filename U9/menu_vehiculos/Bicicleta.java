package menu_vehiculos;

public class Bicicleta extends Vehiculo {
	private int kilometrajeBici;
	
	public Bicicleta(int kilBi) {
		
		this.kilometrajeBici=kilBi;
		
	}
	public int CogeKil() {
		return this.kilometrajeBici;
	}
	
	public void avanzaBici() {
		System.out.println("La bicicleta avanza");
	}
	
	public void caballito() {
		System.out.println("La bicicleta hace el caballito");
	}
}
