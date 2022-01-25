/*Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100 (ambos incluidos) y que los muestre 
 * por pantalla. A continuación, el programa indicará para cada uno de ellos si es un número
primo y/o un capicúa de la forma que muestra el ejemplo.*/
import static funcionesU8.FunMatem.esCapicua;
import static funcionesU8.FunMatem.esPrimo;
import static funcionesU8.ArrayUni.generaArrayInt;
import static funcionesU8.ArrayBid.muestraArrayUni;
public class ejercicio51U8 {
	public static void main(String[]args) {
		int[] a = generaArrayInt(10, 2, 100);
		System.out.println("Array normal:");
		muestraArrayUni(a);
		System.out.println();
		
		for(int n : a) {
			if(esPrimo(n)) {
				System.out.print("El "+n+" es primo");
			} else {
				System.out.print("El "+n+" no es primo");
			}
			
			if(esCapicua(n)) {
				System.out.println(" y es capicua");
			} else {
				System.out.println(" y no es capicua");
			}
		}
	}
	

		

}
