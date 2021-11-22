/*Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.*/
import java.util.Scanner;
public class ejercicio14U7 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		String [] palabras = new String[8];
		String [] color = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
		String [] result = new String[8];
		int contador=0;
		
		for(int i=0; i<8; i++) {
			System.out.print("Introduce palabras, te quedan "+(8-i)+": ");
			palabras[i]= x.next();
			for (String c : color) {
				if (palabras[i].equals(c)) {
					result[contador++] = c;
				}
			}
		}
		
		for (int i = 0; i < 8; i++) {
			boolean esColor = false;
			for (String c : color) {
				if (palabras[i].equals(c)) {
					esColor = true;
				}
			}
			if (!esColor) {
				result[contador++] = palabras[i];
			}
		}

		
		System.out.println("\nArray original:");
		System.out.print("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐\n");
		for(int i=0; i<8; i++) {
			System.out.printf("|%5d   ",i);
		}
		System.out.print("|");
		System.out.print("\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤\n");
		for(int i=0; i<8; i++) {
			System.out.printf("|%-5s   ",palabras[i]);
		}
		System.out.print("|");
		System.out.print("\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘\n");
			
		
		System.out.println("\nArray resultado:");
		System.out.print("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐\n");
		for(int i=0; i<8; i++) {
			System.out.printf("|%5d   ",i);
		}
		System.out.print("|");
		System.out.print("\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤\n");
		for(int i=0; i<8; i++) {
			System.out.printf("|%-5s   ",result[i]);
		}
		System.out.print("|");
		System.out.print("\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘\n");
	}
}
