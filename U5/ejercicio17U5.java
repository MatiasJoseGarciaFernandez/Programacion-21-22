/*Realiza un programa que sume los 100 n�meros siguientes a un n�mero entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un n�mero positivo).*/
import java.util.Scanner;
public class ejercicio17U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("este progama suma los 100 numeros siguientes introducido por teclado");
		int n;
		int suma = 0;
		do {
			System.out.print("introduce un numero: ");
			n = x.nextInt();
			if (n<0) {
				System.out.println("introduce un numero entero positivo por favor");
			}
		} while (n<0);
		
		for (int i=n; i<n+100; i++) {
			suma +=i;
		}
		System.out.print("el total es: " +suma);
	}
}
