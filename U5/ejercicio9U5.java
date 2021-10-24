/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).*/
import java.util.Scanner;
public class ejercicio9U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int digitos = 1; 
		
		System.out.print("Intoduce un numero para decirte cuantos digitos tiene: ");
		int numero = x.nextInt();
		int n = numero;
		
		while (n > 10) {
			n /= 10;
			digitos++;
		}
		
		System.out.println(numero + " tiene " + digitos + " dígitos.");

	}
}
