/*Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).*/
public class ejercicio2U6 {
	public static void main(String[]args) {
		
		System.out.println("Este programa muestra una carta de la baraja francesa");
		
		int palos= (int)(Math.random()*4)+1;
		
		String p="";
		
		switch(palos) {
			case 1:
				p="picas";
				break;
			case 2:
				p="corazones";
				break;
			case 3:
				p="diamantes";
				break;
			case 4:
				p="treboles";
				break;
				default:
		}
		
		int num= (int)(Math.random()*13)+1;
		
		String carta="";
		
		switch(num) {
			case 1:
				carta="As";
				break;
			case 11:
				carta= "J";
				break;
			case 12:
				carta= "Q";
				break;
			case 13:
				carta= "K";
				break;
				default:
					carta= String.valueOf(num);
		}
		
		System.out.println("Ha salido el " +carta+ " de " +p);
	}
}
