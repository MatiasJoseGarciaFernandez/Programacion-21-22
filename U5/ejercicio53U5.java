/*Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.*/
import java.util.Scanner;
public class ejercicio53U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Este programa presenta en pantalla media piramide");
		
		System.out.print("Introduce la altura: ");
		int a = x.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=a; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
