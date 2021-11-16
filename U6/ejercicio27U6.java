/*Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error.*/
import java.util.Scanner;
public class ejercicio27U6 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		String jugada="";
		
		do {
			
			System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
			jugada = x.next();
			if((!jugada.equals("piedra") && (!jugada.equals("papel") && (!jugada.equals("tijera"))))) {
				System.out.println("Opcion incorrecta");
			}
		}while((!jugada.equals("piedra") && (!jugada.equals("papel") && (!jugada.equals("tijera")))));
		
		String m="";
		int n=(int)(Math.random()*3)+1;
			
		switch(n) {
			case 1:
				m="piedra";
				break;
			case 2:
				m="papel";
				break;
			case 3:
				m="tijera";
				break;
				default:
			
		}
		System.out.println("Turno del ordenador: "+m);
		
		if (jugada.equals(m)) {
			System.out.println("Empate");
		} else {
			int ganador = 2;
			switch (jugada) {
				case "piedra":
					if (m.equals("tijera")) {
						ganador = 1;
					}
					break;
				case "papel":
					if (m.equals("piedra")) {
						ganador = 1;
					}
					break;
				case "tijera":
					if (m.equals("papel")) {
						ganador = 1;
					}
					break;
				default:
				}
				if (ganador == 1) {
					System.out.println("Gana el jugador");
				} else {
					System.out.println("Gana el ordenador");
			}
		}
	}
}
