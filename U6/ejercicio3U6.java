/*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.*/
public class ejercicio3U6 {
	public static void main(String[]args) {
System.out.println("Este programa muestra una carta de la baraja española");
		
		int palos= (int)(Math.random()*4)+1;
		
		String p="";
		
		switch(palos) {
			case 1:
				p="oros";
				break;
			case 2:
				p="copas";
				break;
			case 3:
				p="bastos";
				break;
			case 4:
				p="espadas";
				break;
				default:
		}
		
		int num= (int)(Math.random()*10)+1;
		
		String carta="";
		
		switch(num) {
			case 1:
				carta="As";
				break;
			case 8:
				carta= "sota";
				break;
			case 9:
				carta= "caballo";
				break;
			case 10:
				carta= "rey";
				break;
				default:
					carta= String.valueOf(num);
		}
		
		System.out.println("Ha salido el " +carta+ " de " +p);
	}
}
