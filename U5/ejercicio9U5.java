/*Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a n�meros de 5 d�gitos como
m�ximo. En esta ocasi�n, hay que realizar el ejercicio utilizando bucles; de
esta manera, la �nica limitaci�n en el n�mero de d�gitos la establece el tipo de
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
		
		System.out.println(numero + " tiene " + digitos + " d�gitos.");

	}
}
