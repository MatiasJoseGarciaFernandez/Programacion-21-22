/*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
un bucle for.*/
import java.util.Scanner;
public class ejercicio4U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		for (int i=320; i>=160; i-=20) {
			System.out.print(i+" ");
		}
	}
}
