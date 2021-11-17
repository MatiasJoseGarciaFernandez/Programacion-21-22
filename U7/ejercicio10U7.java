/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.*/
public class ejercicio10U7 {
	public static void main(String[]args) {
		
		int [] n = new int[20];
		int [] result = new int[20];
		int contador=0;
		
		System.out.print("Array original: ");
		for(int i=0; i<20; i++) {
			n[i]=(int)(Math.random()*100);
			System.out.print(n[i]+" ");
			if(n[i]%2==0) {
				result[contador++]= n[i];
			}
		}
		
		
		for(int i=0; i<20; i++) {
			if(n[i]%2!=0) {
				result[contador++]= n[i];
			}
		}
		
		System.out.print("\nArray resultante: ");
		for(int i=0; i<20; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
