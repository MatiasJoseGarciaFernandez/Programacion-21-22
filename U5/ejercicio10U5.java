/*Escribe un programa que calcule la media de un conjunto de n�meros positivos
introducidos por teclado. A priori, el programa no sabe cu�ntos n�meros se
introducir�n. El usuario indicar� que ha terminado de introducir los datos
cuando meta un n�mero negativo.*/
import java.util.Scanner;
public class ejercicio10U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		double n;
		double suma=0;
		double divisor = 0;
		System.out.println("Este programa calcula la media de los numeros que introduzca por teclado");
		do {
			System.out.print("Introduce un numero(Pon uno negativo para parar): ");
			n = x.nextDouble();
			divisor++;
			suma += n;
		} while (n>=0);
		double total = (suma-n)/(divisor-1);
		System.out.println("El resultado es: "+total);
	}
}