/*Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:*/
import java.util.Scanner;
public class ejercicio24U5 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("este programa pinta una piramide");
		System.out.print("Introduce la altura: ");
		int a = x.nextInt();
		
		for (int i = 1; i <= a; i++){
			for( int j = 1; j <= a - i; j++){
		        System.out.print(" ");
		    }
		    for(int k = 1; k <= i; k++){
		      System.out.print(k);
		    }
		    for( int l = i - 1; l >= 1; l--){
		      System.out.print(l);
		    }
		    System.out.println();
		}
	}
}

