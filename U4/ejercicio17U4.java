/*Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.*/
import java.util.Scanner;
public class ejercicio17U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("este programa te dice la ultima cifra del numero que introduzca");
		System.out.print("dame el numero: ");
		int n = x.nextInt();
		
		System.out.print("La ultima cifra es: " +n%10);
	}
}
