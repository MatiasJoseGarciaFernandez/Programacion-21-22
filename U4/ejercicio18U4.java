/*Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras*/
import java.util.Scanner;
public class ejercicio18U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("este programa te dice la primera cifra de un numero(hasta 5 cifras)");
		System.out.print("Dame un numero: ");
		int n = x.nextInt();
		
		if (n<10) {
			System.out.print("la cifra es: " +n);
		}
		if ((n>=10) && (n<100)) {
			System.out.print("la cifra es: " +n/10);
		}
		if ((n>=100) && (n<1000)) {
			System.out.print("la cifra es: " +n/100);
		}
		if ((n>=1000) && (n<10000)) {
			System.out.print("la cifra es: " +n/1000);
		}
		if (n>=10000){
			System.out.print("la cifra es: " +n/10000);
		}
		
	}
}
