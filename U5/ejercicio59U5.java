/*Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4*/
import java.util.Scanner;
public class ejercicio59U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
	
		System.out.print("Introduce la altura del arbol: ");
		int a = x.nextInt();
		
		for (int i = 1; i <= a-1; i++) {
			System.out.print(" ");
			}
		System.out.println("*");

		
		for(int i=1;i<=a; i++) {
		      for(int j=1; j<=a-i; j++) {
		        System.out.print(" ");
		        
		      }
		      for(int k=1; k<=(i*2)-1; k++){
		        if( k==1 || k==(i*2)-1 || i==a) {
		          System.out.print("^");
		        } else {
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		      
		    }
		for (int i = 1; i <= a-1; i++) {
			System.out.print(" ");
			}
		System.out.println("Y");

	}
}
