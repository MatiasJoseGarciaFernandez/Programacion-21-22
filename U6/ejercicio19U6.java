/*Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados.*/
public class ejercicio19U6 {
	public static void main(String[]args) {
		
		int maximo=-100;
		int minimo=200;
		int suma=0;
		
		for(int i=0; i<50; i++) {
			int n=(int)(Math.random()*300)-100;
			System.out.print(n+ " ");
			suma+=n;
			if(n%2==0) {
				if(n>maximo) {
					maximo=n;
				}
			} else {
				if(n<minimo){
					minimo=n;
				}
			}
		}
		
		System.out.println("\nEl maximo de los pares es:" +maximo);
		System.out.println("El minimo de los impares es:" +minimo);
		System.out.println("La media de todos los numeros es:" +(suma/50));
	}
}
