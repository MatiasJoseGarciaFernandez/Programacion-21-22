/*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma*/
import java.util.Scanner;
public class ejercicio29U5 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
	
		System.out.print("Introduce un numero grande: ");
		int n = x.nextInt();
		
		System.out.print("Introduce otro numero mas pequeño que el anterior: ");
		int np = x.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%np!=0) {
				System.out.print(i +" ");
			}
		}
	}
}
