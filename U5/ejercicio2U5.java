/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.*/
import java.util.Scanner;
public class ejercicio2U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("este programa muestra los multiplos de 5 hasta el 100");
		
		int i=0;
		
		while (i<=100) {
			System.out.print(i+" ");
			i+=5;
		}
	}
}
