/*Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.*/
import java.util.Scanner;
public class ejercicio1U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.print("dime un dia de la semana y te dire que toca a primera hora (elige entre el 1 al 7 correpondiendo al dia): ");
		int dia= x.nextInt();
		
		switch (dia) {
			case 1:
				System.out.println("Tienes Matematicas");
				break;
			case 2:
				System.out.println("Tienes lengua");
				break;
			case 3:
				System.out.println("Tienes historia");
				break;
			case 4:
				System.out.println("Tienes Matematicas");
				break;
			case 5:
				System.out.println("Tienes ");
				break;
			case 6:
				System.out.println("Es fin de semana disfruta!");
				break;
			case 7:
				System.out.println("Es fin de semana disfruta!");
				break;
			default:
				System.out.print("No existe mas de siete dias");
		}
	}
}
