/*Escribe un programa que ordene tres números enteros introducidos por teclado.*/
import java.util.Scanner;
public class ejercicio13U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("introduce 3 numeros y te lo mostramos ordenado");
		System.out.print("Dame el primer numero: ");
		int n1 = x.nextInt();
		System.out.print("Dame el segundo numero: ");
		int n2 = x.nextInt();
		System.out.print("Dame el tercer numero: ");
		int n3 = x.nextInt();
		
		//ordena los dos primeros numeros
		if (n1 > n2) {
			int aux = n1;
			n1 = n2;
			n2= aux;
		}
		
		//ordena los dos ultimos numeros
		if (n2 > n3) {
			int aux = n2;
			n2 = n3;
			n3= aux;
		}
		
		//repetimos la ordenacion de los dos primeros numeros
		if (n1 > n2) {
			int aux = n1;
			n1 = n2;
			n2= aux;
		}
		System.out.print("El orden queda asi: " +n1+ ", " +n2+ ", " +n3);
	}
}
