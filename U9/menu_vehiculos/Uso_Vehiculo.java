package menu_vehiculos;
import java.util.Scanner;

public class Uso_Vehiculo {
	public static void main(String [] args) {
		Scanner x = new Scanner(System.in);
		
		Bicicleta Nm = new Bicicleta(10);
		Coche Citroen = new Coche(40);
		
		int opciones=0;
		int km=0;
		
		while(opciones!=8) {
			
			
			System.out.println("VEHICULOS");
			System.out.println("==========");
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometraje de la bicicleta");
			System.out.println("6. Ver kilometraje del coche");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Salir");
			System.out.print("Elige una opción (1-8): ");
			opciones = x.nextInt();
			
			switch(opciones) {
			case 1: 
				System.out.print("Cuantos kilometros quieres recorrer: ");
				km = x.nextInt();
				Nm.recorre(km);
				Nm.avanzaBici();
				break;
			case 2:
				Nm.caballito();
				break;
			case 3:
				System.out.print("Cuantos kilometros quieres recorrer: ");
				km = x.nextInt();
				Citroen.recorre(km);
				Citroen.avanzaCoche();
				break;
			case 4:
				Citroen.quemaRueda();
				break;
			case 5:
				System.out.println(Nm.getKilometrosRecorridos());
				break;
			case 6:
				System.out.println(Citroen.getKilometrosRecorridos());
				break;
			case 7:
				System.out.println(Vehiculo.getKilometrosTotales());
				break;
				default:
			}
		}
	}
}
