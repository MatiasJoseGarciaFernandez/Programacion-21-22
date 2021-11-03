/*Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no.*/
import java.util.Scanner;
public class ejercicio42U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		boolean esPrimo = true;
		
		System.out.print("Introduce un numero: ");
		int n = x.nextInt();
		
		for (int i = n; i < n + 5; i++) {
			esPrimo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) {
				System.out.println(i + " es primo");
			} else {
				System.out.println(i +" no es primo");
			}
		
		}

	}
}
