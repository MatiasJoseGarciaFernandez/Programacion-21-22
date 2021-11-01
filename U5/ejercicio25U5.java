/* Realiza un programa que pida un número por teclado y que luego
muestre ese número al revés.*/
import java.util.Scanner;
public class ejercicio25U5 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num = x.nextInt();
		int n = num;
		int volteado = 0;
		while (n > 0) {
		volteado = (volteado * 10) + (n % 10);
		n /= 10;
		} 
		System.out.println("Si le damos la vuelta al " + num + " tenemos el " + volteado);
	}
}
