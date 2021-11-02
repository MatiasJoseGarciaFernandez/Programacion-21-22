/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.*/
import java.util.Scanner;
public class ejercicio27U5 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Este programa muestra los multiplos de 3 hasta un numero introducido, los sumas y los cuenta");
		System.out.print("Introduce un numero: ");
		int n = x.nextInt();
		int contador = 0;
		int suma=0;
							
		for (int i = 1; i < n; i++) {
			if ((i % 3) == 0) {
				System.out.print(i + " ");
				contador++;
				suma += i;
			}
		}
		System.out.println("\nHay un total de " +contador+ " multiplos");
		System.out.println("La suma da en total: " + suma);		
	}
}
