/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedir� la altura. El palo horizontal de la L tendr� una longitud de la
mitad (divisi�n entera entre 2) de la altura m�s uno.*/

import java.util.Scanner;
public class ejercicio31U5 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
	
		System.out.println("Este programa muestra una L");
		System.out.print("Introduce la altura: ");
		int c =x.nextInt();
		
		for(int i=0; i<c-1; i++) {
			System.out.println("*");
		}
		for(int j=0; j<=c/2; j++) {
			System.out.print("*");
		}
	}
}
