/*Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.*/
import java.util.Scanner;
public class ejercicio18U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("este programa obtienes los numeros enteros comprendido entres dos numeros introducido por teclado");
		System.out.print("introduce el numero de comienzo: ");
		int com = x.nextInt();
		System.out.print("introduce el numero de fin: ");
		int fin = x.nextInt();
		
		for(int i=com; i<=fin; i+=7) {
			System.out.print(i +" ");
		}
	}
}
