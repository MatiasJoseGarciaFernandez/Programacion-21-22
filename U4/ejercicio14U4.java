/*Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5*/
import java.util.Scanner;
public class ejercicio14U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Este programa te dice si un numero es par o divisible entre 5");
		System.out.print("Introduce un numero: ");
		int n= x.nextInt();
		
		if (n%2==0) {
			System.out.print("El numero es par. ");
		} else {
			System.out.print("El numero es impar. ");
		}
		if (n%5==0) {
			System.out.print("El numero es divisible entre 5");
		} else {
			System.out.print("El numero introducido no es divisible entre 5");
		}
	}
}
