/*Escribe un programa que lea 15 n�meros por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posici�n 0
debe pasar a la posici�n 1, el de la 1 a la 2, etc. El n�mero que se encuentra en
la �ltima posici�n debe pasar a la posici�n 0. Finalmente, muestra el contenido
del array.*/
import java.util.Scanner;
public class ejercicio6U7 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int [] n = new int[15];
		
		System.out.print("Introduce datos para rellenar un array:");
		
		for(int i=0; i<15; i++) {
			n[i]=x.nextInt();
		}
		
		int aux=n[14];
		
		for(int i=14; i>0; i--) {
			n[i]= n[i-1];
		}
		n[0]=aux;
		
		for(int i=0; i<15; i++) {	
			System.out.print(n[i]+" ");
		}
	}
}
