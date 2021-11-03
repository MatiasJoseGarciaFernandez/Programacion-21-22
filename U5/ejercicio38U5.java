/*Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.*/
import java.util.Scanner;
public class ejercicio38U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int a;
		System.out.println("este programa pinta un reloj de arena en pantalla");
		
		do {
			
			System.out.print("Introduce la altura: ");
			a = x.nextInt();
			
			if((a<3) || (a%2==0)) {
				System.out.println("Debes introducir una altura impar y mayor o igual a 3");
			}
			
		}while ((a<3) || (a%2==0));
		
		
		for(int i = (a/2)+1; i>=1; i--) {
			for(int j=1; j<=a-i; j++) {
				System.out.print(" ");			
			}
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 2; i<=(a/2)+1; i++) {
			for(int j=1; j<=a-i; j++) {
				System.out.print(" ");			
			}
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
