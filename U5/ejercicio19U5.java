/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/
import java.util.Scanner;
public class ejercicio19U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("este programa pinta una piramide");
		System.out.print("Introduce la altura: ");
		int a = x.nextInt();
		System.out.print("Introduce el caracter: ");
		String caracter = x.next();
		
		for(int i = 1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) {
				System.out.print(" ");			
			}
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}
}
