/*Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.*/
import java.util.Scanner;
public class ejercicio5U7 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int [] n = new int[10];
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		
		System.out.print("Introduce datos para rellenar un array:");
		
		for(int i=0; i<10; i++) {
			n[i]=x.nextInt();
			
			if(n[i]>maximo) {
				maximo = n[i];
			}else if(n[i]<minimo) {
				minimo = n[i];
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(n[i]);
			if (n[i] == maximo) {
				System.out.print(" máximo");
			}
			if (n[i] == minimo) {
				System.out.print(" mínimo");
			}
			System.out.println();
		}
	}
}
