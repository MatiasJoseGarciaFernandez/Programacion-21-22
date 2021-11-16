/*Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.*/
import java.util.Scanner;
public class ejercicio9U7 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int [] n = new int[8];
		
		System.out.print("Introduce datos para rellenar un array:");
		
		for(int i=0; i<8; i++) {
			n[i]=x.nextInt();
		}
		
		for(int i=0; i<8; i++) {
			
			System.out.print(" | "+n[i] +" | ");
			if(n[i]%2==0) {
				System.out.print(" <--(par) ");
			} else {
				System.out.print(" <--(impar) ");
			}
		}
	}
}
