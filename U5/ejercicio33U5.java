/*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.*/
import java.util.Scanner;
public class ejercicio33U5 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("introduce la altura de la U: ");
		int c = x.nextInt();
		
		for( int i = 0; i < c; i++){
			for( int j = 1; j <= c; j++){
				if( i == c - 1){
					if( j == 1 || j == c ){
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}else if( j == 1 || j == c){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}    
	}
}
