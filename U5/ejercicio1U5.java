/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.*/
import java.util.Scanner;
public class ejercicio1U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("este programa muestra los multiplos de 5 hasta el 100");
		
		for(int i=0; i<=100; i+=5) {
			System.out.print(i + " ");
		}
	}
}
