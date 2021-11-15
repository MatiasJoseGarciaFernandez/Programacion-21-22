/*Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.*/
public class ejercicio18U6 {
	public static void main(String[]args) {
		
		
		
		int c1;
		int c2;
		int c3;
		
		do {
			c1 = (int)(Math.random() * 6)+1;
			c2 = (int)(Math.random() * 6)+1;
			c3 = (int)(Math.random() * 6)+1;
		} while ((c1 == c2) || (c1 == c3) || (c2 == c3));

		switch(c1) {
			case 1:
				System.out.print("rojo ");
				break;
			case 2:
				System.out.print("azul ");
				break;
			case 3:
				System.out.print("verde ");
				break;
			case 4:
				System.out.print("amarillo ");
				break;
			case 5:
				System.out.print("violeta ");
				break;
			case 6:
				System.out.print("naranja ");
				break;
			}
			switch(c2) {
			case 1:
				System.out.print("rojo ");
				break;
			case 2:
				System.out.print("azul ");
				break;
			case 3:
				System.out.print("verde ");
				break;
			case 4:
				System.out.print("amarillo ");
				break;
			case 5:
				System.out.print("violeta ");
				break;
			case 6:
				System.out.print("naranja ");
				break;
		}
		switch(c3) {
		case 1:
			System.out.print("rojo ");
			break;
		case 2:
			System.out.print("azul ");
			break;
		case 3:
			System.out.print("verde ");
			break;
		case 4:
			System.out.print("amarillo ");
			break;
		case 5:
			System.out.print("violeta ");
			break;
		case 6:
			System.out.print("naranja ");
			break;
		}	
	}
}
