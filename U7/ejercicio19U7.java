/*Realiza un programa que sea capaz de insertar un número en una posición
concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición
donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
siempre se perderá.*/
import java.util.Scanner;
public class ejercicio19U7 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int[]n= new int[12];
		
		for(int i=0; i<12; i++) {
			n[i]= (int)(Math.random()*200);
		}
		
		System.out.print("Indice: ");
		
		for(int i=0; i<12; i++) {
			System.out.printf("%5d",i);
		}
		System.out.print("\nValor:  ");
		for(int i=0; i<12; i++) {
			System.out.printf("%5d",n[i]);
		}
		System.out.println();
		
		System.out.print("\nIntroduce el numero que quieres insertar: ");
		int nIns = x.nextInt();
		System.out.print("Introduce la posicion que quieres insertar(0-11): ");
		int pos = x.nextInt();
		
		System.out.println();
		System.out.print("Indice: ");
		
		for(int i=0; i<12; i++) {
			System.out.printf("%5d",i);
		}
		for(int i=11; i>pos; i--) {
			n[i]=n[i-1];
		}
		n[pos]=nIns;
		System.out.print("\nValor:  ");
		
		for(int num:n) {
			System.out.printf("%5d",num);
		}
		
	}
}
