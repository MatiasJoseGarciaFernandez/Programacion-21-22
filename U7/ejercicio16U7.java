/*Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.*/
import java.util.Scanner;
public class ejercicio16U7 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int [] n = new int[20];
		int respuesta=0;
		
		for(int i=0; i<20; i++) {
			n[i]=(int)(Math.random()*400);
			System.out.print(n[i]+" ");
		}
		System.out.println();
		System.out.print("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		respuesta = x.nextInt();
		System.out.println();
		
		for(int i=0; i<20; i++) {
			if(respuesta==1 && n[i]%5==0) {
				System.out.print("["+n[i]+"] ");
			} else if(respuesta==2 && n[i]%7==0) {
				System.out.print("["+n[i]+"] ");
			} else {
				System.out.print(n[i]+" ");
			}
		}
	}
}
