/*Realiza un programa que pinte un tri�ngulo relleno tal como se muestra en
los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
ya se realiz� en el tema de bucles, ahora se trata de usar una funci�n para
que la implementaci�n sea m�s sencilla. Por ejemplo, se puede crear una
funci�n linea(char caracter, int repeticiones) que pinte una l�nea con el car�cter
especificado.*/
import java.util.Scanner;
public class ejercicio41U8 {
	public static void main(String[]args){
		Scanner x = new Scanner(System.in);
		
		System.out.print("introduce la altura de la piramide: ");
		int altura=x.nextInt();
		System.out.print("Introduce el caracter con el que quieras dibujarla:");
		char caracter=x.next().charAt(0);
		
		creaPiramide(altura,caracter);
	}
	
	public static int creaPiramide(int x, char m) {
		
		for(int i=0; i<x; i++) {
			for(int j=x; j>i; j--) {
				System.out.print(m);
			}
			System.out.println();
		}
		return x;
		
	}
	
}
