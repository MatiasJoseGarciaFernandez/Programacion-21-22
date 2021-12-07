/*Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.*/
public class ejercicio11BidU7 {
	public static void main(String[]args) {
	
		final int DIMENSION=10;
		int maximo=200;
		int minimo=300;
		int suma=0;
		
		int[][] n = new int [DIMENSION][DIMENSION];
		
		for(int i=0; i<DIMENSION; i++) {
			for(int j=0; j<DIMENSION; j++) {
				n[i][j]=(int)(Math.random()*101)+200;
				System.out.printf("%5d", n[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		System.out.println("Los numeros desde la esquina superior izquierda hasta la esquina inferior derecha:");
		for(int i=0; i<DIMENSION; i++) {
			int num = n[i][i];
			System.out.printf("%5d", num);
			suma+=num;
				
			if(num>maximo) {
				maximo=num;
			}
			if(num<minimo) {
				minimo=num;
			}
		}
		System.out.println("\nmaximo: " +maximo);
		System.out.println("minimo: " +minimo);
		System.out.println("media: " +suma/10);
	}
}
