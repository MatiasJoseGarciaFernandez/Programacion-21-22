/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.*/
import java.util.Scanner;
public class ejercicio11U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int n= x.nextInt();
	
		for (int i=n; i<n+5; i++) {
			System.out.printf("|%2d | %2d | %2d |\n", i, i * i, i * i * i);
		}
		
	}
}
