/*Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.*/
import java.util.Scanner;
public class ejercicio57U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Este programa presenta en pantalla media piramide");
		
		System.out.print("Introduce la altura: ");
		int a = x.nextInt();
		
		int espacios=0;
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<espacios; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<a-i; k++) {
				if(k==0 || i==0 || k==a-i-1) {
					System.out.print("*");
			    } else {
			        System.out.print(" ");
			    }
			}
			System.out.println();
			espacios++;
		}
		
		
	}
}

