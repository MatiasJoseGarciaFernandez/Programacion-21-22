/*Escribe un programa que lea 10 n�meros por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el �ltimo en mostrarse
y viceversa*/
import java.util.Scanner;
public class ejercicio3U7 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int [] n = new int[10];
		
		System.out.print("Introduce datos para rellenar un array:");
		
		for(int i=0; i<10; i++) {
			n[i]=x.nextInt();
		}
		
		for(int i=9; i>=0; i--) {
			System.out.print(n[i]+" ");
		}
	}
}
