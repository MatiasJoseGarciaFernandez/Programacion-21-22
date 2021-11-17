/*Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos 
 * entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.*/
import java.util.Scanner;
public class ejercicio13U7 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int [] n = new int[100];
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int respuesta;
		
		for (int i=0; i<100; i++) {
			n[i]=(int)(Math.random()*500);
			System.out.print(n[i]+" ");
			if(n[i]>maximo) {
				maximo = n[i];
			}else if(n[i]<minimo) {
				minimo = n[i];
			}
		}

		System.out.println();
		System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
		respuesta = x.nextInt();
		System.out.println();
		
		for(int i=0; i<100; i++) {	
			if (respuesta==1 && n[i]==minimo) {
				System.out.print("**"+minimo+"** ");
			}else if(respuesta==2 && n[i]==maximo) {
				System.out.print("**"+maximo+"** ");
			}else {
			System.out.print(n[i]+" ");
			}
		}
	}
}
