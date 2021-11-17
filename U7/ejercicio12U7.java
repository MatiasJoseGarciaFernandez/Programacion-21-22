/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.*/
import java.util.Scanner;
public class ejercicio12U7 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int [] n = new int[10];
		int [] r = new int[10];
		
		System.out.println("Introduce datos para rellenar un array");
		
		for(int i=0; i<10; i++) {
			System.out.print("Te quedan por introducir " +(10-i)+ " numeros: ");
			n[i]=x.nextInt();
		}
		
		int posI=0;
		
		int posF=0;
		
		do {
			System.out.print("Introduce la posicion inical (entre 0 y 9): ");
			posI=x.nextInt();
			if ((posI>9) || (posI<0)) {
				System.out.println("Posicion incorrecta");
			}
		} while ((posI>9) || (posI<0));
		
		do {
			System.out.print("Introduce la posicion final (entre 0 y 9): ");
			posI=x.nextInt();
			if ((posF>9) || (posF<0)) {
				System.out.println("Posicion incorrecta");
			}
		} while ((posF>9) || (posF<0));
		
		System.out.print("\nArray original: ");
		for(int i=0; i<10; i++) {	
			System.out.print(n[i]+" ");
		}
		
		int aux = n [9];
	    r[posF] = r[posI];
	    for( int i = posF + 1; i < 10; i++){
	      r[i] = n[i - 1];
	    }
	    r[0] = aux;
	    for( int i = posI; i > 0; i--){
	      r[i] = n[i - 1];
	    }
	    System.out.println();
		System.out.print("\nArray final: ");
		for(int i=0; i<10; i++) {	
			System.out.print(r[i]+" ");
		}
		
	}
}
