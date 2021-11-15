/*Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.*/
public class ejercicio23U6 {
	public static void main(String[]args) {
		
		String d="";
		
		for(int i=0; i<5; i++) {
			
			int dado=(int)(Math.random()*6)+1;
			
			switch(dado) {
				case 1:
					d="As";
					break;
				case 2:
					d="K";
					break;
				case 3:
					d="Q";
					break;
				case 4:
					d="J";
					break;
				case 5:
					d="7";
					break;
				case 6:
					d="8";
					break;
					default:
			}
			System.out.print(d+ " ");
		}
	}
}
