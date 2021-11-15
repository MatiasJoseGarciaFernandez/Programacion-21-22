/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/
public class ejercicio11U6 {
	public static void main(String[]args) {
		
		int cuentasus=0;
		int cuentasuf=0;
		int cuentabie=0;
		int cuentanot=0;
		int cuentasob=0;
		
		for(int i=0; i<20; i++) {
			
			int notas=(int)(Math.random()*5)+1;
			String n="";
			
			switch (notas) {
				case 1:
					n="suspenso";
					break;
				case 2:
					n="suficiente";
					break;
				case 3:
					n="bien";
					break;
				case 4:
					n="notable";
					break;
				case 5:
					n="sobresaliente";
					break;
					default:	
			}
			
			System.out.println(n+" ");
			
			if(n.equals("suspenso")) {
				cuentasus++;
			}
			if(n.equals("suficiente")) {
				cuentasuf++;
			}
			if(n.equals("bien")) {
				cuentabie++;
			}
			if(n.equals("notable")) {
				cuentanot++;
			}
			if(n.equals("sobresaliente")) {
				cuentasob++;
			}		
		}
		
		System.out.println("\nHay un total de " +cuentasus+ " suspensos");
		System.out.println("Hay un total de " +cuentasuf+ " suficientes");
		System.out.println("Hay un total de " +cuentabie+ " bienes");
		System.out.println("Hay un total de " +cuentanot+ " notables");
		System.out.println("Hay un total de " +cuentasob+ " sobresalientes");
	}
}
