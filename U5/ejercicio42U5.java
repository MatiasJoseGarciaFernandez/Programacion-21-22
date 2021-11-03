/*Escribe un programa que pida un n�mero entero positivo por teclado y que
muestre a continuaci�n los 5 n�meros consecutivos a partir del n�mero
introducido. Al lado de cada n�mero se debe indicar si se trata de un primo
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
